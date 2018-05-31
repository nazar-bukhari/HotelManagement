package com.nazar.hotelManagement.exception;

public class NoDomainFoundException extends ApplicationException {

    private static final String GENERIC_MESSAGE = "No model found with the given criteria(s)";

    public NoDomainFoundException(){
        super(GENERIC_MESSAGE);
    }

    public NoDomainFoundException(String message){
        super(message);
    }
}
