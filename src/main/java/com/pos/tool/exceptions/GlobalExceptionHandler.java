package com.pos.tool.exceptions;

import com.pos.tool.domain.response.POSExceptionResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

    @ExceptionHandler(POSCustomException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody POSExceptionResponse handleResourceNotFound(final POSCustomException exception,
                                                                     final HttpServletRequest request) {

        POSExceptionResponse error = new POSExceptionResponse();
        error.setErrorMsg(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public @ResponseBody POSExceptionResponse handleException(final Exception exception,
                                                           final HttpServletRequest request) {

        POSExceptionResponse error = new POSExceptionResponse();
        error.setErrorMsg(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());

        return error;
    }

}