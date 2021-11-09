package br.com.letscode.java.sistemacomercial.entity.venda;

import br.com.letscode.java.sistemacomercial.entity.funcionario.Funcionario;
import br.com.letscode.java.sistemacomercial.entity.item.Item;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Data
@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate data;
    private String endereco;

    @OneToMany(mappedBy = "id")
    private List<Item> item;

    @OneToMany(mappedBy = "id")
    private List<Funcionario> funcionarios;

}