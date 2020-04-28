package com.hamzaygrtc.cms.exception;

//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;

//@ResponseStatus(HttpStatus.NOT_FOUND)//404 error için
public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String messege){
        super(messege);
    }
}
