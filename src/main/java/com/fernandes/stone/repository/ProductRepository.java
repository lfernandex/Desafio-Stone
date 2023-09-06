package com.fernandes.stone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.stone.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
