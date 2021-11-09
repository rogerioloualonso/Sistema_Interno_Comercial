package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.loja.Loja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Lojas extends JpaRepository<Loja,Integer> {
}
