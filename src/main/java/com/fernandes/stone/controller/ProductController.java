package com.fernandes.stone.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fernandes.stone.dto.ProductDTO;
import com.fernandes.stone.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/starstore")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/products")
    public ResponseEntity<Page<ProductDTO>> insert (String name, Pageable pageable){
        Page<ProductDTO> prod = service.find(name, pageable);
        return ResponseEntity.ok(prod);
    }

    @PostMapping(value = "/product")
    public ResponseEntity<ProductDTO> insert (@Valid @RequestBody ProductDTO dto){
        dto = service.insert(dto);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        
        return ResponseEntity.created(uri).body(dto);
    }
    

}
