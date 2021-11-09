package br.com.letscode.java.sistemacomercial.repository;

import br.com.letscode.java.sistemacomercial.entity.funcionario.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Funcionarios extends JpaRepository<Funcionario,Integer> {
}
