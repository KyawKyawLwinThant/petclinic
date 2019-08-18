package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class Person extends BaseEntity {
  private String firstName;
  private String lastName;
}
