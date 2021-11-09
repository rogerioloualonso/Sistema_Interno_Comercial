package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Enderecos extends JpaRepository<Endereco,Integer> {
}
