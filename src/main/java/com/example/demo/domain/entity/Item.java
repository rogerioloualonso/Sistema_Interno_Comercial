package com.example.demo.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "qtd")
    private Integer qtd;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(
            name = "venda_id",
            nullable = false
    )
    private Venda venda;

    @ManyToOne
    @JoinColumn(
            name = "produto_id",
            nullable = false
    )
    private Produto produto;

}
