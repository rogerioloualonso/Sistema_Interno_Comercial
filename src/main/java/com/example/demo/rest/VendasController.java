package com.example.demo.rest;

import com.example.demo.domain.entity.Funcionario;
import com.example.demo.domain.entity.Vendas;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/vendas")
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
}
