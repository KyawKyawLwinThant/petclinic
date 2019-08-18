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
@Data
public class Pet extends NameEntity {
  @Enumerated(EnumType.STRING)
  private PetType petType;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private LocalDate dateofbirth;
  @ManyToOne
  private Owner owner;


}
