package com.solt.petclinicdemo.service;

import com.solt.petclinicdemo.model.Owner;
import com.solt.petclinicdemo.model.Pet;
import com.solt.petclinicdemo.repository.OwnerRepository;
import com.solt.petclinicdemo.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

  private final OwnerRepository ownerRepository;
  private final PetRepository petRepository;

  public OwnerServiceImpl(OwnerRepository ownerRepository,PetRepository petRepository) {
    this.ownerRepository = ownerRepository;
    this.petRepository = petRepository;
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

  @Override
  public Pet addPet(Pet pet, long ownerId) {
    pet.setOwner(findById(ownerId));
    this.petRepository.save(pet);
    return pet;
  }

  @Override
  public Owner searchByLastName(String lastName) {
    return ownerRepository.findByLastName(lastName);
  }
}
