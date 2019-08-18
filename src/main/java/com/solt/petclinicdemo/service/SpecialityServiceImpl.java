package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Speciality;
import com.solt.petclinicdemo.repository.SpecialityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialityServiceImpl implements SpecialityService {

  private final SpecialityRepository specialityRepository;

  public SpecialityServiceImpl(SpecialityRepository specialityRepository) {
    this.specialityRepository = specialityRepository;
  }

  @Override
  public Speciality create(Speciality speciality) {
    return this.specialityRepository.save(speciality);
  }

  @Override
  public Speciality findById(long id) {
    return this.specialityRepository.getOne(id);
  }

  @Override
  public List<Speciality> findAll() {
    return this.specialityRepository.findAll();
  }
}
