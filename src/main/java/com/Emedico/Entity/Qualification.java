package com.Emedico.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Qualification {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String qualificationName;
	private String instituteName;
	private Date completedYear;
	public Qualification() {
		// TODO Auto-generated constructor stub
	}
	public Qualification(Integer id, String qualificationName, String instituteName, Date completedYear) {
		super();
		this.id = id;
		this.qualificationName = qualificationName;
		this.instituteName = instituteName;
		this.completedYear = completedYear;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQualificationName() {
		return qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public Date getCompletedYear() {
		return completedYear;
	}
	public void setCompletedYear(Date completedYear) {
		this.completedYear = completedYear;
	}
	@Override
	public String toString() {
		return "Qualification [id=" + id + ", qualificationName=" + qualificationName + ", instituteName="
				+ instituteName + ", completedYear=" + completedYear + "]";
	}


}
