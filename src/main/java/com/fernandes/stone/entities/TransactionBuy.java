package com.fernandes.stone.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_transaction")
public class TransactionBuy{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientId;
    private String clientName;
    private Integer totalToPay;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_trans_cred",
        joinColumns = @JoinColumn(name = "transaction_id"),
        inverseJoinColumns = @JoinColumn(name = "credito_id"))
    private List<CrediCard> cards = new ArrayList<>();


    public TransactionBuy(){
        
    }

    public TransactionBuy(Long id, String clientId, String clientName, Integer totalToPay) {
        this.id = id;
        this.clientId = clientId;
        this.clientName = clientName;
        this.totalToPay = totalToPay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Integer getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(Integer totalToPay) {
        this.totalToPay = totalToPay;
    }

    public List<CrediCard> getCards() {
        return cards;
    }

 
}
