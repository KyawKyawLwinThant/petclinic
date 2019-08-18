package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Vet;

import java.util.List;

public interface VetService {

  Vet create(Vet vet);
  Vet findById(long id);
  List<Vet> findAll();


}
