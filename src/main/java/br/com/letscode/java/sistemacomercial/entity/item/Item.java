package br.com.letscode.java.sistemacomercial.entity.item;

import br.com.letscode.java.sistemacomercial.entity.produto.Produto;
import br.com.letscode.java.sistemacomercial.entity.venda.Venda;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    int qtd;

    @OneToMany
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @OneToMany
    @JoinColumn(name = "venda_id")
    private Venda venda;

}
