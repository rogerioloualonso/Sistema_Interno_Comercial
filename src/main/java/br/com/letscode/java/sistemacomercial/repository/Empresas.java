package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Empresas extends JpaRepository<Empresa, Integer> {
}
