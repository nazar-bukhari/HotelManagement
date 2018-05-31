package com.nazar.hotelManagement.exception;

import javax.validation.ConstraintViolation;
import java.util.Set;

public class ApplicationException extends Exception {

    private Set<ConstraintViolation<?>> violations;

    public ApplicationException() {
    }

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApplicationException(Throwable cause) {
        super("We have faced an error.Please contact with the admin.",cause);
    }

    public ApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Set<ConstraintViolation<?>> getViolations() {
        return violations;
    }

    public void setViolations(Set<ConstraintViolation<?>> violations) {
        this.violations = violations;
    }
}
