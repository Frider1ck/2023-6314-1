package com.team.userservice.rest.advice;

import com.team.userservice.exception.RoleNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RoleNotFoundExceptionAdvice {
  @ExceptionHandler(RoleNotFoundException.class)
  public ResponseEntity<String> handleException(RoleNotFoundException ex) {
    return ResponseEntity.status(404).body(ex.getMessage());
  }
}
