package com.fernandes.stone.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_credito")
public class CrediCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardNumber;
    private String cardHolderName;
    private Integer valueBuy;
    private Integer cvv;
    private String expDate;

    @ManyToMany(mappedBy = "cards")
    private List<TransactionBuy> transaction = new ArrayList<>();

    public CrediCard(){
        
    }

    public CrediCard(Long id, String cardNumber, String cardHolderName, Integer valueBuy, Integer cvv, String expDate) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.valueBuy = valueBuy;
        this.cvv = cvv;
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

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public Integer getValueBuy() {
        return valueBuy;
    }

    public void setValueBuy(Integer valueBuy) {
        this.valueBuy = valueBuy;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public List<TransactionBuy> getTransaction() {
        return transaction;
    }

}
