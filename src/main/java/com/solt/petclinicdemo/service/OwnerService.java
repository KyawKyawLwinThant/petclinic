package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Owner;
import com.solt.petclinicdemo.model.Pet;

import java.util.List;

public interface OwnerService {
  Owner create(Owner owner);
  Owner findById(long id);
  List<Owner> findAll();
  Pet addPet(Pet pet,long ownerId);
  Owner searchByLastName(String lastName);
}
