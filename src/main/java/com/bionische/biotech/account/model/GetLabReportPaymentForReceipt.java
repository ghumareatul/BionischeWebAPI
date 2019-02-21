package com.bionische.biotech.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GetLabReportPaymentForReceipt {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="lab_app_id")
	private int appointId;
	
	@Column(name="lab_id")
	private int labId;
	
	@Column(name="paid_amount")
	private float amount;
	
	@Column(name="txn_id")
	private String txnId;
	
	@Column(name = "payment_date")
	private String paymentDate;
	
	@Column(name="patient_id")
	private int patientId;

	public int getAppointId() {
		return appointId;
	}

	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}

	 

	public int getLabId() {
		return labId;
	}

	public void setLabId(int labId) {
		this.labId = labId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getTxnId() {
		return txnId;
	}

	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "GetLabReportPaymentForReceipt [appointId=" + appointId + ", labId=" + labId + ", amount=" + amount
				+ ", txnId=" + txnId + ", paymentDate=" + paymentDate + ", patientId=" + patientId + "]";
	}

	 
	
}
