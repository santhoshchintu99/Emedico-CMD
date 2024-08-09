package com.Emedico.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emedico.Entity.Specilaization;
import com.Emedico.Repository.SpecilaizationRepo;

@Service
public class Specilaizationservice {
	@Autowired
	private SpecilaizationRepo specializationRepository;

	public List<Specilaization> findAll() {
		return specializationRepository.findAll();
	}

	public Specilaization findById(Integer sid) {
		return specializationRepository.getById(sid);
	}

	public Specilaization save(Specilaization specialization) {
		return specializationRepository.save(specialization);
	}

	public Specilaization update(Specilaization specialization) {
		return specializationRepository.save(specialization);
	}
	public void deleteById(Integer sid) {
		specializationRepository.deleteById(sid);
	}
}
