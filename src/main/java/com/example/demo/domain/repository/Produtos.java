package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface Produtos extends JpaRepository<Produto, Integer>{
    @Query(value = " select * from produto p where p.nome like '%:nome%' ", nativeQuery = true)
    List<Produto> encontrarPorNome(@Param("nome") String nome );

    @Query(" delete from Produto p where p.nome =:nome ")
    @Modifying
    void deleteByNome(String nome);

    boolean existsByNome(String nome);
}
