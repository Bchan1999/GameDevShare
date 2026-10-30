package com.chan.GameDevShare.exception;

public class EmailAlreadyUsedException extends AppException {
    public EmailAlreadyUsedException(String email) {
        super("Email already in use: " + email, org.springframework.http.HttpStatus.CONFLICT);
    }
}
