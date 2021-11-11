package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_funcionario")
    private Integer id_funcionario;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column (name = "cpf", length = 100)
    private Integer cpf;

    public Funcionario(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
