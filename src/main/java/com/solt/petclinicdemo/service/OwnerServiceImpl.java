package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Owner;
import com.solt.petclinicdemo.repository.OwnerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

  private final OwnerRepository ownerRepository;

  public OwnerServiceImpl(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  @Override
  public Owner create(Owner owner) {
    return ownerRepository.save(owner);
  }

  @Override
  public Owner findById(long id) {
    return ownerRepository.findById(id).orElse(null);
  }

  @Override
  public List<Owner> findAll() {
    return ownerRepository.findAll();
  }
}
