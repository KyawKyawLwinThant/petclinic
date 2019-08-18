package com.solt.petclinicdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Vet extends Person {

  public Vet(String firstName,String lastName){
    super(firstName,lastName);
  }

  public Vet(){

  }

  @ManyToMany
  private Set<Speciality> specialities=new HashSet<>();

  public void addSepciality(Speciality speciality){
    specialities.add(speciality);
  }


  public Set<Speciality> getSpecialities() {
    return specialities;
  }

  public void setSpecialities(Set<Speciality> specialities) {
    this.specialities = specialities;
  }
}
