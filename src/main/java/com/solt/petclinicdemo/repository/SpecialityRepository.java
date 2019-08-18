package com.solt.petclinicdemo.repository;

import com.solt.petclinicdemo.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialityRepository extends JpaRepository<Speciality,Long> {
}
