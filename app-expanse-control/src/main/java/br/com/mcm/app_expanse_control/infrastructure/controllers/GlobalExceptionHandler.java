package br.com.mcm.app_expanse_control.infrastructure.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    public static final String MSG_GENERAL_END_USER_ERROR
            = "An unexpected internal error has occurred in the system. Try again and if "
            + " the problem persists, contact your system administrator.";

    @Autowired
    private MessageSource messageSource;


}

