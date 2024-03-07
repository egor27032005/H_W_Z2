package org.example;

public class IncorrectValueException extends RuntimeException{
    public IncorrectValueException(String messege){
        super(messege);
    }
}