package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class NameEntity extends BaseEntity {

  private String name;
}
