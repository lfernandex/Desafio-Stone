package com.fernandes.stone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.stone.entities.TransactionBuy;

public interface TransactionBuyRepository extends JpaRepository<TransactionBuy, Long>{
    
}
