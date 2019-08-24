package com.solt.petclinicdemo.repository;

import com.solt.petclinicdemo.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VetRepository extends JpaRepository<Vet,Long> {

  public Optional<Vet> findByLastName(String lastName);

}
