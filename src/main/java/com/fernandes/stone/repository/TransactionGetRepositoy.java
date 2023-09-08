package com.fernandes.stone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernandes.stone.entities.TransactionGet;

public interface TransactionGetRepositoy extends JpaRepository<TransactionGet, Long>{
    
}
