package com.solt.petclinicdemo.model;

import lombok.Data;
import org.hibernate.cfg.annotations.NamedEntityGraphDefinition;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity

public class Pet extends NameEntity {
  @Enumerated(EnumType.STRING)
  private PetType petType;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate dateofbirth;
  @ManyToOne
  private Owner owner;


  public Pet(String name, PetType petType, LocalDate dateofbirth) {
    super(name);
    this.petType = petType;
    this.dateofbirth = dateofbirth;
  }

  public Pet() {
  }


  public PetType getPetType() {
    return petType;
  }

  public void setPetType(PetType petType) {
    this.petType = petType;
  }

  public LocalDate getDateofbirth() {
    return dateofbirth;
  }

  public void setDateofbirth(LocalDate dateofbirth) {
    this.dateofbirth = dateofbirth;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }
}
