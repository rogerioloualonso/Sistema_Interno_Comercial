package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "vendas" )
public class Vendas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "data")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(
            name = "id_funcionario",
            nullable = false
    )
    private Funcionario funcionario;

    @OneToMany(
            mappedBy = "vendas"
    )
    private List<Item> itemList;
}
