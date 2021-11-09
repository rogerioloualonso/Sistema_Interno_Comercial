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

    private String name;
    private int telefone;

    @OneToMany(mappedBy = "id")
    private List<Endereco> endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
