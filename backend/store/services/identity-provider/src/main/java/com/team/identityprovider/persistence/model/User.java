package com.team.identityprovider.persistence.model;

import lombok.Value;

@Value
public class User {
  Long id;
  String name;
  String email;
  String password;
  boolean active;
  String role;
}
