package com.team.authorizeservice.service.impl;

import com.team.authorizeservice.security.details.ProjectionUserDetails;
import com.team.authorizeservice.service.api.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class UsernamePasswordAuthenticationService implements AuthenticationService {
  private final AuthenticationManager authenticationManager;

  @Autowired
  public UsernamePasswordAuthenticationService(AuthenticationManager authenticationManager) {
    this.authenticationManager = authenticationManager;
  }

  @Override
  public ProjectionUserDetails authenticate(String email, String password) {
    var authToken = new UsernamePasswordAuthenticationToken(email, password);
    var authentication = authenticationManager.authenticate(authToken);
    SecurityContextHolder.getContext().setAuthentication(authentication);
    return (ProjectionUserDetails) authentication.getPrincipal();
  }
}
