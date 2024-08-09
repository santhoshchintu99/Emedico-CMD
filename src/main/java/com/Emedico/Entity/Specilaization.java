package com.Emedico.Entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Specilaization {

	
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String specializationName;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "specializations")
	@JsonIgnore
	private List<Doctor> doctors;
	public Specilaization() {
		// TODO Auto-generated constructor stub
	}
	public Specilaization(Integer id, String specializationName, List<Doctor> doctors) {
		super();
		this.id = id;
		this.specializationName = specializationName;
		this.doctors = doctors;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSpecializationName() {
		return specializationName;
	}
	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	@Override
	public String toString() {
		return "Specilaization [id=" + id + ", specializationName=" + specializationName + ", doctors=" + doctors + "]";
	}

}
