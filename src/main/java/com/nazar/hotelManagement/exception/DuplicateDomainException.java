package com.nazar.hotelManagement.exception;

public class DuplicateDomainException extends ApplicationException {

    private static final String GENERIC_MESSAGE = "Duplicate Entry Found";

    public DuplicateDomainException(){
        super(GENERIC_MESSAGE);
    }

    public DuplicateDomainException(String message) {
        super(message);
    }
}
