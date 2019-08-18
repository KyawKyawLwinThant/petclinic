package com.solt.petclinicdemo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
@Data
public class Visit extends BaseEntity {

  private LocalDate date;

  private String description;
  @Column(name="my_pet_id")
  private Long pet_id;

  @ManyToOne
  private Pet pet;
}
