package com.wecp.progressive.exception;

<<<<<<< HEAD
import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PatientNotFoundException extends RuntimeException {

    // public PatientNotFoundException(String msg) {
    //     super(msg);
    // }

    @ExceptionHandler(SQLException.class)
    public ResponseEntity<String> handleException(SQLException e) {
    return new ResponseEntity<>("Patient not found", HttpStatus.INTERNAL_SERVER_ERROR);
    }
=======
public class PatientNotFoundException {
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
}