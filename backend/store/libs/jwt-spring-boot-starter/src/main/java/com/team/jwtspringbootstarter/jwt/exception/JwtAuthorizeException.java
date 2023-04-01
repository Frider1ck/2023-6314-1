package com.team.jwtspringbootstarter.jwt.exception;

public class JwtAuthorizeException extends RuntimeException {
  public JwtAuthorizeException() {
    super();
  }

  public JwtAuthorizeException(String message) {
    super(message);
  }
}
