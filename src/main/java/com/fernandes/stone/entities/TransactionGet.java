package com.fernandes.stone.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_transget")
public class TransactionGet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String clientId;
    private String purchaseId;
    private Integer valueBuy;
    private String dateBuy;
    private String cardNumber;

    public TransactionGet(){
    }

    public TransactionGet(Long id, String cardNumber, String clientId, Integer valueBuy, String dateBuy, String purchaseId) {
        this.id = id;
        this.clientId = clientId;
        this.purchaseId = purchaseId;
        this.valueBuy = valueBuy;
        this.dateBuy = dateBuy;
        this.cardNumber = cardNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getValueBuy() {
        return valueBuy;
    }

    public void setValueBuy(Integer valueBuy) {
        this.valueBuy = valueBuy;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

}
