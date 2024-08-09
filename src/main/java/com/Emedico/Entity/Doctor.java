package com.Emedico.Entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String profrssionalStmt;
	private String practicingFrom;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="aid")
	//@JsonIgnore
	private Address address;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="qid")
	//@JsonIgnore
	private Qualification qualification;
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="doctor_specialization", joinColumns = {@JoinColumn(name="did",referencedColumnName = "id")},inverseJoinColumns= {@JoinColumn(name="sid",referencedColumnName="id")})
	//@JsonIgnore
	private List<Specilaization> specializations;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="hid")
	//@JsonIgnore
    private Hospital hospital;
	public Doctor() {
		// TODO Auto-generated constructor stub
	}
	public Doctor(Integer id, String firstName, String lastName, String mobile, String email, String profrssionalStmt,
			String practicingFrom, Address address, Qualification qualification, List<Specilaization> specializations,
			Hospital hospital) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.profrssionalStmt = profrssionalStmt;
		this.practicingFrom = practicingFrom;
		this.address = address;
		this.qualification = qualification;
		this.specializations = specializations;
		this.hospital = hospital;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfrssionalStmt() {
		return profrssionalStmt;
	}
	public void setProfrssionalStmt(String profrssionalStmt) {
		this.profrssionalStmt = profrssionalStmt;
	}
	public String getPracticingFrom() {
		return practicingFrom;
	}
	public void setPracticingFrom(String practicingFrom) {
		this.practicingFrom = practicingFrom;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Qualification getQualification() {
		return qualification;
	}
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}
	public List<Specilaization> getSpecializations() {
		return specializations;
	}
	public void setSpecializations(List<Specilaization> specializations) {
		this.specializations = specializations;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobile=" + mobile
				+ ", email=" + email + ", profrssionalStmt=" + profrssionalStmt + ", practicingFrom=" + practicingFrom
				+ ", address=" + address + ", qualification=" + qualification + ", specializations=" + specializations
				+ ", hospital=" + hospital + "]";
	}

}

	