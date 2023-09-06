package com.fernandes.stone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fernandes.stone.dto.ProductDTO;
import com.fernandes.stone.entities.Product;
import com.fernandes.stone.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public Page<ProductDTO> find(String name, Pageable pageable){

        Page<Product> prod = repository.findAll(pageable);
        
        return prod.map(x -> new ProductDTO(x));
    }

    @Transactional
    public ProductDTO insert(ProductDTO dto){

        Product entity = new Product();

        copyFromDTO(entity, dto);

        entity = repository.save(entity);

        return new ProductDTO(entity);
    }

    private void copyFromDTO (Product prod, ProductDTO dto){
        prod.setTitle(dto.getTitle());
        prod.setPrice(dto.getPrice());
        prod.setZipcode(dto.getZipcode());
        prod.setSeller(dto.getSeller());
        prod.setThumbnailHd(dto.getThumbnailHd());
        prod.setDate(dto.getDate());
    }
    
}
