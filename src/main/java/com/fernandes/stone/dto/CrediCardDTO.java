package com.fernandes.stone.dto;

import java.util.ArrayList;
import java.util.List;

import com.fernandes.stone.entities.CrediCard;
import com.fernandes.stone.entities.TransactionBuy;

public class CrediCardDTO {

    private Long id;
    private String cardNumber;
    private String cardHolderName;
    private Integer value;
    private Integer cvv;
    private String expDate;

    private List<TransactionBuyDTO> transaction = new ArrayList<>();

    public CrediCardDTO(){
        
    }

    public CrediCardDTO(Long id, String cardNumber, String cardHolderName, Integer value, Integer cvv, String expDate, List<TransactionBuyDTO> transactions) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.value = value;
        this.cvv = cvv;
        this.expDate = expDate;

        for(TransactionBuyDTO buy : transactions){
            transaction.add(buy);
        }
    }

    public CrediCardDTO(CrediCard entity) {
        id = entity.getId();
        cardNumber = entity.getCardNumber();
        cardHolderName = entity.getCardHolderName();
        value = entity.getValueBuy();
        cvv = entity.getCvv();
        expDate = entity.getExpDate();

        for(TransactionBuy buy : entity.getTransaction()){
            transaction.add(new TransactionBuyDTO(buy));
        }
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


    public Integer getValue() {
        return value;
    }


    public void setValue(Integer value) {
        this.value = value;
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

    public List<TransactionBuyDTO> getTransaction() {
        return transaction;
    }
    
}
