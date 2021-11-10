package br.com.letscode.java.sistemacomercial.entity.fornecedor;

import br.com.letscode.java.sistemacomercial.entity.endereco.Endereco;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int telefone;

    @ManyToOne
    @JoinColumn(name = "endeco_id")
    private Endereco endereco;

    public Fornecedor(String nome, int telefone) {
        this.id = null;
        this.nome = nome;
        this.telefone = telefone;
    }

}
