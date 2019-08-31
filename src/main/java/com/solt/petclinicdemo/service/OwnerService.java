package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Owner;

import java.util.List;

public interface OwnerService {
  Owner create(Owner owner);
  Owner findById(long id);
  List<Owner> findAll();
}
