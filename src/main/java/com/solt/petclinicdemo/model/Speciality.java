package com.solt.petclinicdemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Speciality extends NameEntity {

  public Speciality(String name){
    super(name);
  }
  public Speciality(){

  }

  @ManyToMany(mappedBy = "specialities")
  private List<Vet> vets=new ArrayList<>();

  public void addVet(Vet vet){
    vets.add(vet);
  }

  public List<Vet> getVets() {
    return vets;
  }

  public void setVets(List<Vet> vets) {
    this.vets = vets;
  }
  @Override
  public String toString(){
    return super.getName();
  }
}
