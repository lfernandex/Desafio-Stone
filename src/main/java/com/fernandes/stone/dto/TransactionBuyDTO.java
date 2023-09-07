package com.fernandes.stone.dto;

import com.fernandes.stone.entities.TransactionBuy;

public class TransactionBuyDTO{

    private Long id;
    private String clientId;
    private String clientName;
    private Integer totalToPay;

    private CrediCardDTO credito;

    public TransactionBuyDTO(){
    }

    public TransactionBuyDTO(Long id, String clientId, String clientName, Integer totalToPay, CrediCardDTO credito) {
        this.id = id;
        this.clientId = clientId;
        this.clientName = clientName;
        this.totalToPay = totalToPay;
        this.credito = credito;
    }

    public TransactionBuyDTO(TransactionBuy entity) {
        id = entity.getId();
        clientId = entity.getClientId();
        clientName = entity.getClientName();
        totalToPay = entity.getTotalToPay();
        credito = (entity.getCrediCard() == null) ? null : new CrediCardDTO(entity.getCrediCard());
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

    public CrediCardDTO getCredito() {
        return credito;
    }

    public void setCredito(CrediCardDTO credito) {
        this.credito = credito;
    }

}
