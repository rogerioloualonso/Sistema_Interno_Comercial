package br.com.letscode.java.sistemacomercial.entity.loja;

import br.com.letscode.java.sistemacomercial.entity.funcionario.Funcionario;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table( name = "loja" )
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "endereco", length = 100)
    private String endereco;

    @Column(name = "telefone", length = 15)
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionarios;

    public Loja(String nome, String endereco, String telefone) {
        this.id = null;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
}

