package com.Emedico.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Emedico.Entity.Doctor;
import com.Emedico.Entity.Hospital;
import com.Emedico.Entity.Specilaization;
import com.Emedico.Repository.DoctorRepo;
import com.Emedico.Repository.HospitalRepo;
import com.Emedico.Repository.SpecilaizationRepo;

@Service
public class Doctorservice {
	@Autowired
	private DoctorRepo doctorRepository;
	
	@Autowired
	private SpecilaizationRepo specializationRepository;
	
	@Autowired
	private HospitalRepo hospitalRepository;
	
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	public Doctor findById(Integer did) {
		return doctorRepository.getById(did);
	}
	public void deleteById(Integer did) {
		doctorRepository.deleteById(did);
	}

	public Doctor save(Doctor doctor) {
		Hospital hospital = hospitalRepository.getById(doctor.getHospital().getId());
		List<Specilaization> specializations = doctor.getSpecializations().stream().map(spe -> specializationRepository.getById(spe.getId())).collect(Collectors.toList());
		doctor.setHospital(hospital);
		doctor.setSpecializations(specializations);
		
		hospitalRepository.save(hospital);
		specializations.forEach(spe-> specializationRepository.save(spe));
		return doctorRepository.save(doctor);

}
}