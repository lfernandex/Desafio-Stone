package com.fernandes.stone.dto;

import com.fernandes.stone.entities.CrediCard;

public class CrediCardDTO {

    private String cardNumber;
    private String cardHolderName;
    private Integer valueBuy;
    private Integer cvv;
    private String expDate;

    public CrediCardDTO(){
        
    }

    public CrediCardDTO(String cardNumber, String cardHolderName, Integer valueBuy, Integer cvv, String expDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.valueBuy = valueBuy;
        this.cvv = cvv;
        this.expDate = expDate;
    }

    public CrediCardDTO(CrediCard entity) {
        cardNumber = entity.getCardNumber();
        cardHolderName = entity.getCardHolderName();
        valueBuy = entity.getValueBuy();
        cvv = entity.getCvv();
        expDate = entity.getExpDate();
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
    
}
