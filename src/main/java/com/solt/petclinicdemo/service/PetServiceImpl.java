package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Pet;
import com.solt.petclinicdemo.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {

  private final PetRepository petRepository;


  public PetServiceImpl(PetRepository petRepository) {
    this.petRepository = petRepository;
  }

  @Override
  public Pet findByid(long id) {
    return petRepository.getOne(id);
  }

  @Override
  public List<Pet> findAll() {
    return petRepository.findAll();
  }
}
