package com.example.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "vendas" )
public class Venda {

    @Id
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
            mappedBy = "venda"
    )
    private List<Item> itemList;
}
