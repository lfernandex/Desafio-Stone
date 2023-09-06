package com.fernandes.stone.service.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super (message);
    }
    
}
