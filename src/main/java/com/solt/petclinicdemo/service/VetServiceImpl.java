package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Vet;
import com.solt.petclinicdemo.repository.VetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VetServiceImpl implements VetService {

  private final VetRepository vetRepository;

  public VetServiceImpl(VetRepository vetRepository) {
    this.vetRepository = vetRepository;
  }

  @Override
  public Vet create(Vet vet) {
    return this.vetRepository.save(vet);
  }

  @Override
  public Vet findById(long id) {
    return this.vetRepository.getOne(id);
  }

  @Override
  public List<Vet> findAll() {
    return this.vetRepository.findAll();
  }

  @Override
  public Vet searchVetLastName(String name) {
    return vetRepository.findByLastName(name);
  }
}
