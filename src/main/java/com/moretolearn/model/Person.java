package com.moretolearn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@Column(name = "p_id")
	private Integer pId;
	
	@Column(name = "p_name")
	private String pName;
	
	@Column(name = "p_salary")
	private Double pSalary;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Double getpSalary() {
		return pSalary;
	}

	public void setpSalary(Double pSalary) {
		this.pSalary = pSalary;
	}
	
	
}
