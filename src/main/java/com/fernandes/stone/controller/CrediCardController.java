package com.fernandes.stone.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fernandes.stone.dto.TransactionBuyDTO;
import com.fernandes.stone.service.TransactionBuyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/starstore")
public class CrediCardController {

    @Autowired
    private TransactionBuyService service;

    @PostMapping(value = "/buy")
    public ResponseEntity<TransactionBuyDTO> insert (@Valid @RequestBody TransactionBuyDTO dto){
        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{clientId}").buildAndExpand(dto.getClientId()).toUri();

        return ResponseEntity.created(uri).body(dto);
    }
    
}
