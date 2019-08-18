package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Speciality extends NameEntity {
  @ManyToMany(mappedBy = "specialities")
  private List<Vet> vets=new ArrayList<>();

  public void addVet(Vet vet){
    vets.add(vet);
  }
}
