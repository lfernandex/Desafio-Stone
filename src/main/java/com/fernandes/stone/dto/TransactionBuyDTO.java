package com.fernandes.stone.dto;

import java.util.ArrayList;
import java.util.List;

import com.fernandes.stone.entities.CrediCard;
import com.fernandes.stone.entities.TransactionBuy;

public class TransactionBuyDTO{

    private Long id;
    private String clientId;
    private String clientName;
    private Integer totalToPay;

    private List<CrediCardDTO> cards = new ArrayList<>();

    public TransactionBuyDTO(){
    }

    public TransactionBuyDTO(Long id, String clientId, String clientName, Integer totalToPay) {
        this.id = id;
        this.clientId = clientId;
        this.clientName = clientName;
        this.totalToPay = totalToPay;
    }

    public TransactionBuyDTO(TransactionBuy entity) {
        id = entity.getId();
        clientId = entity.getClientId();
        clientName = entity.getClientName();
        totalToPay = entity.getTotalToPay();
    
        List<CrediCardDTO> cardDTOs = new ArrayList<>();
    
        for (CrediCard card : entity.getCards()) {
            CrediCardDTO cardDTO = new CrediCardDTO();
            cardDTO.setCardNumber(card.getCardNumber());
            cardDTO.setCardHolderName(card.getCardHolderName());
            cardDTO.setValue(card.getValueBuy());
            cardDTO.setCvv(card.getCvv());
            cardDTO.setExpDate(card.getExpDate());
    
            cardDTOs.add(cardDTO);
        }
    
        cards = cardDTOs;
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

    public List<CrediCardDTO> getCards() {
        return cards;
    }

}
