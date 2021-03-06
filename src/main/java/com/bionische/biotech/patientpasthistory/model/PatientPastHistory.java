package com.bionische.biotech.patientpasthistory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_past_history")

public class PatientPastHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="past_history_id")
	private  int patientPastHistoryId;
	@Column(name="patient_id")
	private int patientId;
	@Column(name="past_history_illness_id")
	private String pastHistoryIllnessId;
	@Column(name="other",nullable = true)
	private String other;
	@Column(name="int_1")
	private int int1;
	@Column(name="int_2")
	private int int2;
	@Column(name="string1",nullable = true)
	private String string1;
	@Column(name="string2",nullable = true)
	private String string2;
	/**
	 * @return the patientPastHistoryId
	 */
	public int getPatientPastHistoryId() {
		return patientPastHistoryId;
	}
	/**
	 * @param patientPastHistoryId the patientPastHistoryId to set
	 */
	public void setPatientPastHistoryId(int patientPastHistoryId) {
		this.patientPastHistoryId = patientPastHistoryId;
	}
	/**
	 * @return the patientId
	 */
	public int getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the pastHistoryIllnessId
	 */
	public String getPastHistoryIllnessId() {
		return pastHistoryIllnessId;
	}
	/**
	 * @param pastHistoryIllnessId the pastHistoryIllnessId to set
	 */
	public void setPastHistoryIllnessId(String pastHistoryIllnessId) {
		this.pastHistoryIllnessId = pastHistoryIllnessId;
	}
	/**
	 * @return the other
	 */
	public String getOther() {
		return other;
	}
	/**
	 * @param other the other to set
	 */
	public void setOther(String other) {
		this.other = other;
	}
	/**
	 * @return the int1
	 */
	public int getInt1() {
		return int1;
	}
	/**
	 * @param int1 the int1 to set
	 */
	public void setInt1(int int1) {
		this.int1 = int1;
	}
	/**
	 * @return the int2
	 */
	public int getInt2() {
		return int2;
	}
	/**
	 * @param int2 the int2 to set
	 */
	public void setInt2(int int2) {
		this.int2 = int2;
	}
	/**
	 * @return the string1
	 */
	public String getString1() {
		return string1;
	}
	/**
	 * @param string1 the string1 to set
	 */
	public void setString1(String string1) {
		this.string1 = string1;
	}
	/**
	 * @return the string2
	 */
	public String getString2() {
		return string2;
	}
	/**
	 * @param string2 the string2 to set
	 */
	public void setString2(String string2) {
		this.string2 = string2;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PatientPastHistory [patientPastHistoryId=" + patientPastHistoryId + ", patientId=" + patientId
				+ ", pastHistoryIllnessId=" + pastHistoryIllnessId + ", other=" + other + ", int1=" + int1 + ", int2="
				+ int2 + ", string1=" + string1 + ", string2=" + string2 + "]";
	}
	
	 
	
	
	
	
	
	
	
	
	
	
	
}
