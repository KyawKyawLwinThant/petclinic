package com.solt.petclinicdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NameEntity extends BaseEntity {

  private String name;

  public NameEntity(){

  }

  public NameEntity(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
