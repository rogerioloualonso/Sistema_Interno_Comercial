package br.com.letscode.java.sistemacomercial.entity.empresa;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class empresa {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int cnpj;
    private int telefone;




}
