package com.Emedico.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emedico.Entity.Qualification;
import com.Emedico.Repository.QualificationRepo;

@Service
public class Qualificationservice {

	@Autowired
	private QualificationRepo qualificationRepository;
	
	public List<Qualification> findAll() {
		return qualificationRepository.findAll();
	}

	public Qualification findById(Integer qid) {
		return qualificationRepository.getById(qid);
	}

	public Qualification save(Qualification qualification) {
		return qualificationRepository.save(qualification);
	}

	public Qualification update(Qualification qualification) {
		return qualificationRepository.save(qualification);
	}

	 public void deleteById(Integer qid) {
		qualificationRepository.deleteById(qid);
	}
	 }
