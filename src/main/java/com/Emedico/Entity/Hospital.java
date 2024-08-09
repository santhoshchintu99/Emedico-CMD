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
import jakarta.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String hospitalName;
	private String city;
	private String state;
	private String country;
	private Date startDate;
	private Date endDate;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "hospital")
	@JsonIgnore
	private List<Doctor> doctors;
	public Hospital() {
		// TODO Auto-generated constructor stub
	}
	public Hospital(Integer id, String hospitalName, String city, String state, String coutry, Date startDate,
			Date endDate, List<Doctor> doctors) {
		super();
		this.id = id;
		this.hospitalName = hospitalName;
		this.city = city;
		this.state = state;
		this.country = coutry;
		this.startDate = startDate;
		this.endDate = endDate;
		this.doctors = doctors;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCoutry() {
		return country;
	}
	public void setCoutry(String coutry) {
		this.country = coutry;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	@Override
	public String toString() {
		return "Hospital [id=" + id + ", hospitalName=" + hospitalName + ", city=" + city + ", state=" + state
				+ ", coutry=" + country + ", startDate=" + startDate + ", endDate=" + endDate + ", doctors=" + doctors
				+ "]";
	}


}
