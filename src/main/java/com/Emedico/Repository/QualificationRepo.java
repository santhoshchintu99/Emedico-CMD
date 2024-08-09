package com.Emedico.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Emedico.Entity.Qualification;

public interface QualificationRepo extends JpaRepository<Qualification, Integer> {

}
