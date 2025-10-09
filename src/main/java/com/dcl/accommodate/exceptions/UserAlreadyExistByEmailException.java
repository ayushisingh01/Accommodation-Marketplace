package com.dcl.accommodate.exceptions.handler;

public class UserAlreadyExistByEmailException extends RuntimeException {
    public UserAlreadyExistByEmailException(String message) {
        super(message);
    }
}
