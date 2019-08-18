package com.solt.petclinicdemo.model;

public enum PetType {

  Cat("White"),Hamspter("Yellow"),Dog("Dark"),Tiger("Brown");

  private String color;

  PetType(String color){
    this.color=color;
  }

  public String getColor(){
    return color;
  }

}
