package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Owner extends Person{
  private String address;
  private String city;
  private String telephone;
}
