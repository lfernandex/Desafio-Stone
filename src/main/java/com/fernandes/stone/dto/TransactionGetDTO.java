package com.fernandes.stone.dto;

import com.fernandes.stone.entities.TransactionGet;

public class TransactionGetDTO {
    
    private String clientId;
    private String purchaseId;
    private Integer valueBuy;
    private String dateBuy;
    private String cardNumber;
    
    public TransactionGetDTO(){
        
    }
    
    public TransactionGetDTO(String cardNumber, String clientId, Integer valueBuy, String dateBuy, String purchaseId) {

        this.clientId = clientId;
        this.purchaseId = purchaseId;
        this.valueBuy = valueBuy;
        this.dateBuy = dateBuy;
        this.cardNumber = cardNumber;
        
    }

    public TransactionGetDTO(TransactionGet entity) {

        clientId = entity.getClientId();
        purchaseId = entity.getPurchaseId();
        valueBuy = entity.getValueBuy();
        dateBuy = entity.getDateBuy();
        cardNumber = entity.getCardNumber();
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
