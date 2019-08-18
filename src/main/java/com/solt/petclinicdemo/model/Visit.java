package com.solt.petclinicdemo.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Visit extends BaseEntity {
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate date;

  private String description;
  @Column(name="my_pet_id")
  private Long pet_id;

  @ManyToOne
  private Pet pet;

  public Visit() {
  }


  public Visit(LocalDate date, String description) {
    this.date = date;
    this.description = description;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getPet_id() {
    return pet_id;
  }

  public void setPet_id(Long pet_id) {
    this.pet_id = pet_id;
  }

  public Pet getPet() {
    return pet;
  }

  public void setPet(Pet pet) {
    this.pet = pet;
  }
}
