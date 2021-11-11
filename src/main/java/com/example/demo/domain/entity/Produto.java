package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "produto" )
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "qtdEstoque")
    private Integer qtdEstoque;

    @Column(name = "valor")
    private float valor;

    @OneToMany(
            mappedBy = "produto"
    )
    private List<Item> item;

}
