package com.example.demo.rest;

import com.example.demo.domain.entity.Funcionario;
import com.example.demo.domain.entity.Vendas;
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
    public Vendas getVendaById(@PathVariable Integer id ){
        return vendas
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Venda não encontrada"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vendas save(@RequestBody Vendas vendas){
        return vendas.save(vendas);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Integer id ){
        vendas.findById(id)
                .map(funcionario -> {
                    vendas.delete(vendas);
                    return vendas;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Venda não encontrada") );
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update( @PathVariable Integer id,
                        @RequestBody Vendas vendas){
        vendas
                .findById(id)
                .map(vendaExistente -> {
                    vendas.setId(vendaExistente.getId());
                    vendas.save(vendas);
                    return vendaExistente;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Venda não encontrada") );
    }

    @GetMapping
    public List<Funcionario> find(Funcionario filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return funcionarios.findAll(example);
    }


}
