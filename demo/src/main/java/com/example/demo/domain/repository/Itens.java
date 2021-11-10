package com.example.demo.domain.repository;

import com.example.demo.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Itens extends JpaRepository<Item, Integer>{
}
