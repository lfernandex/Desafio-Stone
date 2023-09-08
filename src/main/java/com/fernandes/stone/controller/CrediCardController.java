package com.fernandes.stone.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fernandes.stone.dto.TransactionBuyDTO;
import com.fernandes.stone.dto.TransactionGetDTO;
import com.fernandes.stone.service.TransactionBuyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/starstore")
public class CrediCardController {

    @Autowired
    private TransactionBuyService service;


    @GetMapping(value = "/history/{clientId}")
    public ResponseEntity<Page<TransactionGetDTO>> findById(@PathVariable String clientId, Pageable pageable){

        Pageable pageables = PageRequest.of(0, 2);

        Page<TransactionGetDTO> dto = service.findByClientId(clientId, pageables);
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/history")
    public ResponseEntity<Page<TransactionGetDTO>> findAll(TransactionGetDTO dto, Pageable pageable){
        Page<TransactionGetDTO> get = service.findAll(dto, pageable);
        return ResponseEntity.ok(get);
    }

    @PostMapping(value = "/buy")
    public ResponseEntity<TransactionBuyDTO> insert (@Valid @RequestBody TransactionBuyDTO dto){
        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{clientId}").buildAndExpand(dto.getClientId()).toUri();

        return ResponseEntity.created(uri).body(dto);
    }
    
}
