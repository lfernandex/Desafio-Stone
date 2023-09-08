package com.fernandes.stone.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fernandes.stone.entities.TransactionGet;

public interface TransactionGetRepositoy extends JpaRepository<TransactionGet, Long>{

    @Query("SELECT obj FROM TransactionGet obj "
            + "WHERE UPPER (obj.clientId) = UPPER(:clientId) ")
    Page<TransactionGet> searchByClientId(@Param("clientId")String clientId, Pageable pageable);

    
}
