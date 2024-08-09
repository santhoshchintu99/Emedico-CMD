package com.Emedico.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emedico.Entity.Hospital;
import com.Emedico.HosptialNotFoundException.HospitalNotFoundException;
import com.Emedico.Repository.HospitalRepo;

@Service
public class Hospitalservice {
	@Autowired
	private HospitalRepo hospitalRepository;

	public List<Hospital> findAll() {
		return hospitalRepository.findAll();
	}

	public Hospital findById(Integer hid) {
		Optional<Hospital> hospitalOp = hospitalRepository.findById(hid);
		if (!hospitalOp.isPresent()) {
			throw new HospitalNotFoundException("With this Hid Hospital Not Found");
		}
		return hospitalOp.get();
	}

	
	public Hospital save(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}

	public Hospital update(Hospital hospital) {
		return hospitalRepository.save(hospital);
	}

	public void deleteById(Integer hid) {
		if (!hospitalRepository.findById(hid).isPresent()) {
			throw new HospitalNotFoundException("With this Hid Hospital Not Found");
		}
		hospitalRepository.deleteById(hid);
	}


}
