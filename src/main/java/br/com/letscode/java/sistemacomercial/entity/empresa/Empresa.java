package br.com.letscode.java.sistemacomercial.entity.empresa;


import br.com.letscode.java.sistemacomercial.entity.endereco.Endereco;
import br.com.letscode.java.sistemacomercial.entity.loja.Loja;
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

    @OneToMany
    @JoinColumn(name = "endereco_id")
    private List<Endereco> endereco;

    @OneToMany
    @JoinColumn(name = "loja_id")
    private List<Loja> lojas;

}
