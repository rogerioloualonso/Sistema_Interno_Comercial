package br.com.letscode.java.sistemacomercial.entity.empresa;


import br.com.letscode.java.sistemacomercial.entity.endereco.Endereco;
import br.com.letscode.java.sistemacomercial.entity.loja.Loja;
import br.com.letscode.java.sistemacomercial.repository.Lojas;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int cnpj;
    private int telefone;

    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "loja_id")
    private Loja lojas;

    public Empresa(String name, int cnpj, int telefone) {
        this.id = Integer.parseInt(null);
        this.name = name;
        this.cnpj = cnpj;
        this.telefone = telefone;
    }
}
