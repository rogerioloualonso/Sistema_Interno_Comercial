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

    @OneToMany(mappedBy = "id")
    private Produto produto;

    @OneToMany(mappedBy = "id")
    private Venda venda;

}
