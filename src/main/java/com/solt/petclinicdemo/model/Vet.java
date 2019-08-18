package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Vet extends Person {
  @ManyToMany
  private Set<Speciality> specialities=new HashSet<>();

  public void addSepciality(Speciality speciality){
    specialities.add(speciality);
  }

}
