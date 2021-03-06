package com.bionische.biotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GetSelfUploadedPrescriptionToMedical {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="medical_req_id")
	private int requestToMedicalId;
		
	@Column(name="medical_id")
	private int medicalId;
	
	
	@Column(name="order_date")
	private String orderDate;
	
	@Column(name="medical_name")
	private String medicalName;
	
	@Column(name="patient_id")
	private int patientId;
	
	@Column(name="patient_name")
	private String patientName;
	
	@Column(name="delivery_type")
	private int deliveryType;
	
	@Column(name="total_amt")
	private float totalAmt;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="patient_contact")
	private String patientContact;
	
	@Column(name="payment_status")
	private int paymentStatus;

	@Column(name="del_status")
	private int delStatus;

	@Column(name="status")
	private int status;
	
	@Column(name="address")
	private String address;
	
	
	@Column(name="payment_date")
	private String paymentDate;
	
	@Column(name="prescription_name")
	private String prescriptionName;
	
	@Column(name="medical_email")
	private String medicalEmail;
	
	@Column(name="medical_contact")
	private String medicalContact;

	
	
	
	public String getMedicalEmail() {
		return medicalEmail;
	}

	public void setMedicalEmail(String medicalEmail) {
		this.medicalEmail = medicalEmail;
	}

	public String getMedicalContact() {
		return medicalContact;
	}

	public void setMedicalContact(String medicalContact) {
		this.medicalContact = medicalContact;
	}

	public int getRequestToMedicalId() {
		return requestToMedicalId;
	}

	public void setRequestToMedicalId(int requestToMedicalId) {
		this.requestToMedicalId = requestToMedicalId;
	}

	public int getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(int medicalId) {
		this.medicalId = medicalId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getMedicalName() {
		return medicalName;
	}

	public void setMedicalName(String medicalName) {
		this.medicalName = medicalName;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(int deliveryType) {
		this.deliveryType = deliveryType;
	}

	public float getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPatientContact() {
		return patientContact;
	}

	public void setPatientContact(String patientContact) {
		this.patientContact = patientContact;
	}

	public int getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPrescriptionName() {
		return prescriptionName;
	}

	public void setPrescriptionName(String prescriptionName) {
		this.prescriptionName = prescriptionName;
	}

	@Override
	public String toString() {
		return "GetSelfUploadedPrescriptionToMedical [requestToMedicalId=" + requestToMedicalId + ", medicalId="
				+ medicalId + ", orderDate=" + orderDate + ", medicalName=" + medicalName + ", patientId=" + patientId
				+ ", patientName=" + patientName + ", deliveryType=" + deliveryType + ", totalAmt=" + totalAmt
				+ ", pincode=" + pincode + ", patientContact=" + patientContact + ", paymentStatus=" + paymentStatus
				+ ", delStatus=" + delStatus + ", status=" + status + ", address=" + address + ", paymentDate="
				+ paymentDate + ", prescriptionName=" + prescriptionName + ", medicalEmail=" + medicalEmail
				+ ", medicalContact=" + medicalContact + "]";
	}




	
	
	
	
	
	
}
