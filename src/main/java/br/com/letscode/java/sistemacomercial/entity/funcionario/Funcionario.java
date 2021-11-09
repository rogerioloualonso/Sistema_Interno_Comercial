package br.com.letscode.java.sistemacomercial.entity.funcionario;

import br.com.letscode.java.sistemacomercial.entity.endereco.Endereco;
import br.com.letscode.java.sistemacomercial.entity.venda.Venda;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Funcionario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String nome;
        private LocalDate dataNascimento;
        private int cpf;
        private int telefone;

        @OneToMany(mappedBy = "id")
        private Venda venda;

        @OneToMany(mappedBy = "id")
        private List<Endereco> endereço;
}
