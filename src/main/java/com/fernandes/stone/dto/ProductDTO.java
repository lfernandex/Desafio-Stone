package com.fernandes.stone.dto;

import com.fernandes.stone.entities.Product;

public class ProductDTO{

    private Long id;
    private String title;
    private Integer price;
    private String zipcode;
    private String seller;
    private String thumbnailHd;
    private String date;

    public ProductDTO(){

    }

    public ProductDTO(Long id, String title, Integer price, String zipcode, String seller, String thumbnailHd, String date) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.zipcode = zipcode;
        this.seller = seller;
        this.thumbnailHd = thumbnailHd;
        this.date = date;
    }

    public ProductDTO(Product entity){
        id = entity.getId();
        title = entity.getTitle();
        price = entity.getPrice();
        zipcode = entity.getZipcode();
        seller = entity.getSeller();
        thumbnailHd = entity.getThumbnailHd();
        date = entity.getDate();
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