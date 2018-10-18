package com.bionische.biotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GetHospitalDetailsByType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="hospital_id")
	int hospitalId;
	
	@Column(name="hospital_name")
	private String hospitalName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="contact_no")
	private String contactNo;

	@Column(name="email_id")
	private String email;
	
	@Column(name="cityid")
	private int cityId;
	
	@Column(name="state_id")
	private int stateId;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="type")
	private String type;

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "GetHospitalDetailsByType [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", address="
				+ address + ", contactNo=" + contactNo + ", email=" + email + ", cityId=" + cityId + ", stateId="
				+ stateId + ", cityName=" + cityName + ", stateName=" + stateName + ", type=" + type + "]";
	}
	
	
	
}
