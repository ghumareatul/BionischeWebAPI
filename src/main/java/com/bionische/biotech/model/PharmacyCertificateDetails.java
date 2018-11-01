package com.bionische.biotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pharmacy_certificate_details")
public class PharmacyCertificateDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cetrificate_id")
    private int cetrificateId;
	
	@Column(name="certificate")
    private String cetrificate;
	
	@Column(name="pharmacy_id")
    private int pharmacyId;
	
	@Column(name="string1")
    private String string1;
	
	@Column(name="del_status")
    private int delStatus;
	
	@Column(name="int_1")
    private int int1;

	public int getCetrificateId() {
		return cetrificateId;
	}

	public void setCetrificateId(int cetrificateId) {
		this.cetrificateId = cetrificateId;
	}

	public String getCetrificate() {
		return cetrificate;
	}

	public void setCetrificate(String cetrificate) {
		this.cetrificate = cetrificate;
	}

	public int getPharmacyId() {
		return pharmacyId;
	}

	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}

	public String getString1() {
		return string1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}

	@Override
	public String toString() {
		return "PharmacyCertificateDetails [cetrificateId=" + cetrificateId + ", cetrificate=" + cetrificate
				+ ", pharmacyId=" + pharmacyId + ", string1=" + string1 + ", delStatus=" + delStatus + ", int1=" + int1
				+ "]";
	}
	
	

}
