package com.example.demo.rest;

import com.example.demo.domain.entity.Item;
import com.example.demo.domain.repository.Itens;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {
    private Itens itens;
    public ItemController(Itens itens) {
        this.itens = itens;
    }

    @GetMapping("{id}")
    public Item getVendaById(@PathVariable Integer id ){
        return itens
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Item não encontrado"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Item save(@RequestBody Item item){
        return itens.save(item);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Integer id ){
        itens.findById(id)
                .map(item -> {
                    itens.delete(item);
                    return item;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Item não encontrado") );
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update( @PathVariable Integer id,
                        @RequestBody Item item){
        itens
                .findById(id)
                .map(itemExistente -> {
                    item.setId(itemExistente.getId());
                    itens.save(item);
                    return itemExistente;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Item não encontrado") );
    }

    @GetMapping
    public List<Item> find(Item filtro ){
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(
                        ExampleMatcher.StringMatcher.CONTAINING );

        Example example = Example.of(filtro, matcher);
        return itens.findAll(example);
    }
}
