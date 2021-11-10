package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "qtd")
    private Integer qtd;

    @ManyToOne
    @JoinColumn(
            name = "venda_id",
            nullable = false
    )
    private Vendas vendas;

    @ManyToOne
    @JoinColumn(
            name = "produto_id",
            nullable = false
    )
    private Produto produto;

}
