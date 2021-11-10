package br.com.letscode.java.sistemacomercial.entity.endereco;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rua;
    private String bairro;
    private String municipio;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco(String rua, String bairro, String municipio, String cidade, String estado, int cep) {
        this.id = Integer.parseInt(null);
        this.rua = rua;
        this.bairro = bairro;
        this.municipio = municipio;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
}
