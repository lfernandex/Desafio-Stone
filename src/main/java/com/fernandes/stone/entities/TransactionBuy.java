package com.fernandes.stone.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "crediCardID")
    private CrediCard crediCard;


    public TransactionBuy(){
        
    }

    public TransactionBuy(Long id, String clientId, String clientName, Integer totalToPay, CrediCard crediCard) {
        this.id = id;
        this.clientId = clientId;
        this.clientName = clientName;
        this.totalToPay = totalToPay;
        this.crediCard = crediCard;
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

    public CrediCard getCrediCard() {
        return crediCard;
    }

    public void setCrediCard(CrediCard crediCard) {
        this.crediCard = crediCard;
    }

}
