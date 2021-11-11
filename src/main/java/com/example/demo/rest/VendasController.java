package com.example.demo.rest;

import com.example.demo.domain.entity.Venda;
import com.example.demo.domain.repository.Vendas;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {
    private Vendas vendas;
    public VendasController(Vendas vendas) {
        this.vendas = vendas;
    }

    @GetMapping("{id}")
    public Venda getVendaById(@PathVariable Integer id ){
        return vendas
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Venda não encontrada"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Venda save(@RequestBody Venda vendas){
        return vendas.save(venda);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Integer id ){
        vendas.findById(id)
                .map(venda -> {
                    vendas.delete(venda);
                    return venda;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Venda não encontrada") );
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update( @PathVariable Integer id,
                        @RequestBody Venda venda){
        vendas
                .findById(id)
                .map(vendaExistente -> {
                    venda.setId(vendaExistente.getId());
                    vendas.save(venda);
                    return vendaExistente;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Venda não encontrada") );
    }

    @GetMapping
    public List<Venda> find(Venda filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return vendas.findAll(example);
    }


}
