package com.fernandes.stone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fernandes.stone.dto.CrediCardDTO;
import com.fernandes.stone.dto.TransactionBuyDTO;
import com.fernandes.stone.entities.CrediCard;
import com.fernandes.stone.entities.TransactionBuy;
import com.fernandes.stone.repository.TransactionBuyRepository;

import jakarta.transaction.Transactional;

@Service
public class TransactionBuyService {
    
    @Autowired
    private TransactionBuyRepository repository;

    @Transactional
    public TransactionBuyDTO insert (TransactionBuyDTO dto){

        TransactionBuy entity = new TransactionBuy();

        copyFromDto(entity, dto);

        CrediCard card = new CrediCard();
        copyCrediCardFromDto(card, dto.getCredito());

        entity.setCrediCard(card);

        entity = repository.save(entity);

        return new TransactionBuyDTO(entity);    
    }

    private void copyFromDto(TransactionBuy entity, TransactionBuyDTO dto){
        
            entity.setClientName(dto.getClientName());
            entity.setTotalToPay(dto.getTotalToPay());
    }

    private void copyCrediCardFromDto(CrediCard crediCard, CrediCardDTO dto) {
        crediCard.setCardNumber(dto.getCardNumber());
        crediCard.setCardHolderName(dto.getCardHolderName());
        crediCard.setValueBuy(dto.getValueBuy());
        crediCard.setCvv(dto.getCvv());
        crediCard.setExpDate(dto.getExpDate());
    }

}
