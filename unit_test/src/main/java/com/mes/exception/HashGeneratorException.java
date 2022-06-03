package com.mes.exception;

public class HashGeneratorException extends RuntimeException{

    public HashGeneratorException(String message){
        super(message);
    }
    public HashGeneratorException(String message,Throwable cause){
        super(message,cause);
    }
}
