package br.com.letscode.java.sistemacomercial.entity.produto;

import br.com.letscode.java.sistemacomercial.entity.fornecedor.Fornecedor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "marca", length = 30)
    private String marca;

    @Column(name = "descricao", length = 70)
    private String descricao;

    @Column(name = "qtdEstoque", length = 70)
    private int qtdEstoque;

    @Column(name = "preco_unitario")
    private BigDecimal preco;

    @OneToMany(mappedBy = "id")
    private List<Fornecedor> fornecedores;
}
