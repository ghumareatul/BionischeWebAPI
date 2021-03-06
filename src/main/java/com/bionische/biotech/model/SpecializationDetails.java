package com.bionische.biotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_specialization")
public class SpecializationDetails {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="spec_id")
	private int specializationId;
	
	@Column(name="spec_type")
    private String specializationType;
	
	@Column(name="spec_desc")
	private String specializationDescription;
	
	@Column(name="string1")
	private String string1;
	
	@Column(name="string2")
	private String string2;
	
	@Column(name="int_2")
	private int int2;
	
	@Column(name="int_1")
	private int int1;
	
	@Column(name="del_status")
	private int delStatus;


	public int getSpecializationId() {
		return specializationId;
	}


	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}


	public String getSpecializationType() {
		return specializationType;
	}


	public void setSpecializationType(String specializationType) {
		this.specializationType = specializationType;
	}


	public String getSpecializationDescription() {
		return specializationDescription;
	}


	public void setSpecializationDescription(String specializationDescription) {
		this.specializationDescription = specializationDescription;
	}


	public String getString1() {
		return string1;
	}


	public void setString1(String string1) {
		this.string1 = string1;
	}


	public String getString2() {
		return string2;
	}


	public void setString2(String string2) {
		this.string2 = string2;
	}


	public int getInt2() {
		return int2;
	}


	public void setInt2(int int2) {
		this.int2 = int2;
	}


	public int getInt1() {
		return int1;
	}


	public void setInt1(int int1) {
		this.int1 = int1;
	}


	public int getDelStatus() {
		return delStatus;
	}


	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}


	@Override
	public String toString() {
		return "SpecializationDetails [specializationId=" + specializationId + ", specializationType="
				+ specializationType + ", specializationDescription=" + specializationDescription + ", string1="
				+ string1 + ", string2=" + string2 + ", int2=" + int2 + ", int1=" + int1 + ", delStatus=" + delStatus
				+ "]";
	}
	
	 

}
