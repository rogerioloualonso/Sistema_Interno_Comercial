package com.example.demo.rest;

import com.example.demo.domain.entity.Funcionario;
import com.example.demo.domain.repository.Funcionarios;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")

public class FuncionarioController {

    private Funcionarios funcionarios;

    public FuncionarioController(Funcionarios funcionarios) {
        this.funcionarios = funcionarios;
    }


    @GetMapping("{id}")
    public Funcionario getFuncionarioById(@PathVariable Integer id ){
        return funcionarios
                .findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Funcionario não encontrado"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario save(@RequestBody Funcionario funcionario){
        return funcionarios.save(funcionario);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete( @PathVariable Integer id ){
        funcionarios.findById(id)
                .map(funcionario -> {
                    funcionarios.delete(funcionario);
                    return funcionario;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Funcionario não encontrado") );

    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update( @PathVariable Integer id,
                        @RequestBody Funcionario funcionario){
        funcionarios
                .findById(id)
                .map(funcionarioExistente -> {
                    funcionario.setId_funcionario(funcionarioExistente.getId_funcionario());
                    funcionarios.save(funcionario);
                    return funcionarioExistente;
                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Funcionario não encontrado") );
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
