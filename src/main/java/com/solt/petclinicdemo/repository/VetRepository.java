package com.solt.petclinicdemo.repository;

import com.solt.petclinicdemo.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends JpaRepository<Vet,Long> {
}
