package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;

@Entity
public class Owner extends Person{

  private String address;
  private String city;
  private String telephone;

  public Owner(){

  }

  public Owner(String firstName,String lastName,String address, String city, String telephone) {
    super(firstName,lastName);
    this.address = address;
    this.city = city;
    this.telephone = telephone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }
}
