package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Speciality;

import java.util.List;

public interface SpecialityService {

  Speciality create(Speciality speciality);
  Speciality findById(long id);
  List<Speciality> findAll();

}
