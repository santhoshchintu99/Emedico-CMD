package com.Emedico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emedico.Entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

}
