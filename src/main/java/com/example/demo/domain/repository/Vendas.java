package com.example.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface Vendas extends JpaRepository<com.example.demo.domain.entity.Vendas, Integer>{
    @Query(value = " select * from vendas f where f.id like '%:id%' ", nativeQuery = true)
    List<Vendas> encontrarPorId(@Param("id") int id );

    @Query(" delete from Vendas f where f.id =:id ")
    @Modifying
    void deleteById(int id);

    boolean existsById(int id);
}
