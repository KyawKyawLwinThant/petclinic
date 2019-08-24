package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Vet;

import java.util.List;
import java.util.Optional;

public interface VetService {

  Vet create(Vet vet);
  Vet findById(long id);
  List<Vet> findAll();

  Vet searchVetLastName(String name);
}
