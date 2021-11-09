package br.com.letscode.java.sistemacomercial.entity.endereco;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
public class Enderecos {

    @Id
    @GeneratedVelue(strategy = GeneretionType.IDENTITY)
    private int id;

    private String rua;
    private String bairro;
    private String municipio;
    private String cidade;
    private String estado;
    private int cep;

}
