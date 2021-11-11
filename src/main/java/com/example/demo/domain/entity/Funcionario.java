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
@Table( name = "funcionario" )
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column (name = "cpf", length = 100)
    private Integer cpf;

    @OneToMany(
            mappedBy = "funcionario"
    )
    private List<Vendas> vendasList;

    public Funcionario(String nome, Integer cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
