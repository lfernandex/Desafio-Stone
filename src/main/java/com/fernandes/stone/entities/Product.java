package com.fernandes.stone.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer price;
    private String zipcode;
    private String seller;
    private String thumbnailHd;
    private String date;

    public Product(){

    }
    
    public Product(Long id, String title, Integer price, String zipcode, String seller, String thumbnailHd, String date) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.zipcode = zipcode;
        this.seller = seller;
        this.thumbnailHd = thumbnailHd;
        this.date = date;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Integer getPrice() {
        return price;
    }


    public void setPrice(Integer price) {
        this.price = price;
    }


    public String getZipcode() {
        return zipcode;
    }


    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


    public String getSeller() {
        return seller;
    }


    public void setSeller(String seller) {
        this.seller = seller;
    }


    public String getThumbnailHd() {
        return thumbnailHd;
    }


    public void setThumbnailHd(String thumbnailHd) {
        this.thumbnailHd = thumbnailHd;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }

    
}