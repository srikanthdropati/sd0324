package com.pos.tool.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class POSCustomException extends RuntimeException{

    public POSCustomException(String message){
        super(message);
    }

}
