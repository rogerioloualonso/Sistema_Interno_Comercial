package com.example.demo.rest;

import com.example.demo.domain.entity.Funcionario;
import com.example.demo.domain.entity.Produto;
import com.example.demo.domain.repository.Produtos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/produtos")

public class ProdutoController {

    private Produtos produtos;

    public ProdutoController(Produtos produtos){
        this.produtos = produtos;
    }

    @GetMapping("{id}")
    public Produto getProdutoById( @PathVariable Integer id ){
        return produtos
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Produto não encontrado"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto save( @RequestBody Produto produto ){
        return produtos.save(produto);
    }

    @GetMapping
    public List<Produto> find(Produto filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return produtos.findAll(example);
    }
}