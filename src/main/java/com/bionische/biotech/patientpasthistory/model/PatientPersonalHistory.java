package com.bionische.biotech.patientpasthistory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_personal_history")
public class PatientPersonalHistory {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="personal_history_id")
	private int personalHistoryId;
	@Column(name="patient_id")
	private int patientId;
	@Column(name="marital_status",nullable = true)
	private String maritalStatus;
	@Column(name="occupation",nullable = true)
	private String occupation;
	@Column(name="income")
	private String anualIncome;
	@Column(name="addiction",nullable = true)
	private String addiction;
	@Column(name="dietary_habits",nullable = true)
	private String dietaryHabits;
	@Column(name="history_of_conterception",nullable = true)
	private String historyOfConterception;
	@Column(name="high_risk_pehaviour",nullable = true)
	private String highRiskBehaviour;
	@Column(name="string1",nullable = true)
	private String string1;
	@Column(name="string2",nullable = true)
	private String string2;
	@Column(name="string3",nullable = true)
	private String string3;
	@Column(name="string4",nullable = true)
	private String string4;
	@Column(name="int_1")
	private int int1;
	/**
	 * @return the personalHistoryId
	 */
	public int getPersonalHistoryId() {
		return personalHistoryId;
	}
	/**
	 * @param personalHistoryId the personalHistoryId to set
	 */
	public void setPersonalHistoryId(int personalHistoryId) {
		this.personalHistoryId = personalHistoryId;
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
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the anualIncome
	 */
	public String getAnualIncome() {
		return anualIncome;
	}
	/**
	 * @param anualIncome the anualIncome to set
	 */
	public void setAnualIncome(String anualIncome) {
		this.anualIncome = anualIncome;
	}
	/**
	 * @return the addiction
	 */
	public String getAddiction() {
		return addiction;
	}
	/**
	 * @param addiction the addiction to set
	 */
	public void setAddiction(String addiction) {
		this.addiction = addiction;
	}
	/**
	 * @return the dietaryHabits
	 */
	public String getDietaryHabits() {
		return dietaryHabits;
	}
	/**
	 * @param dietaryHabits the dietaryHabits to set
	 */
	public void setDietaryHabits(String dietaryHabits) {
		this.dietaryHabits = dietaryHabits;
	}
	/**
	 * @return the historyOfConterception
	 */
	public String getHistoryOfConterception() {
		return historyOfConterception;
	}
	/**
	 * @param historyOfConterception the historyOfConterception to set
	 */
	public void setHistoryOfConterception(String historyOfConterception) {
		this.historyOfConterception = historyOfConterception;
	}
	/**
	 * @return the highRiskBehaviour
	 */
	public String getHighRiskBehaviour() {
		return highRiskBehaviour;
	}
	/**
	 * @param highRiskBehaviour the highRiskBehaviour to set
	 */
	public void setHighRiskBehaviour(String highRiskBehaviour) {
		this.highRiskBehaviour = highRiskBehaviour;
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
	/**
	 * @return the string3
	 */
	public String getString3() {
		return string3;
	}
	/**
	 * @param string3 the string3 to set
	 */
	public void setString3(String string3) {
		this.string3 = string3;
	}
	/**
	 * @return the string4
	 */
	public String getString4() {
		return string4;
	}
	/**
	 * @param string4 the string4 to set
	 */
	public void setString4(String string4) {
		this.string4 = string4;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PatientPersonalHistory [personalHistoryId=" + personalHistoryId + ", patientId=" + patientId
				+ ", maritalStatus=" + maritalStatus + ", occupation=" + occupation + ", anualIncome=" + anualIncome
				+ ", addiction=" + addiction + ", dietaryHabits=" + dietaryHabits + ", historyOfConterception="
				+ historyOfConterception + ", highRiskBehaviour=" + highRiskBehaviour + ", string1=" + string1
				+ ", string2=" + string2 + ", string3=" + string3 + ", string4=" + string4 + ", int1=" + int1 + "]";
	}
	 
	
	
	
	
}
