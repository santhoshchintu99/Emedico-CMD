package com.Emedico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emedico.Entity.Hospital;

public interface HospitalRepo extends JpaRepository<Hospital,Integer> {

}
