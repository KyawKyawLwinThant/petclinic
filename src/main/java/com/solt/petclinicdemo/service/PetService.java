package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Pet;

import java.util.List;

public interface PetService {
  Pet findByid(long id);
  List<Pet> findAll();
}
