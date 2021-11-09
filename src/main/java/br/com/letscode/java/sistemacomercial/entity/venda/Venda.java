package br.com.letscode.java.sistemacomercial.entity.venda;

import br.com.letscode.java.sistemacomercial.entity.endereco.Endereco;
import br.com.letscode.java.sistemacomercial.entity.loja.Loja;
import br.com.letscode.java.sistemacomercial.entity.produto.Produto;
import lombok.Data;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data

public class Venda {

    Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate data;
    private String endereco;

    @OneToMany(mappedBy = "id")
    private Venda item;

    @OneToMany(mappedBy = "id")
    private Produto funcionarios;


}