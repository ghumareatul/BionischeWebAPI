package com.bionische.biotech.patientpasthistory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_menstrual_obstetric_history")

public class MenstrualObstetricHistory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="menstrual_obstetric_history_id")
	private int menstrualObstetricHistoryId;
	@Column(name="patient_id")
	private int patientId;
	@Column(name="menarche",nullable = true)
	private String menarche;
	@Column(name="duration_of_period",nullable = true)
	private  String durationOfPeriod;
	@Column(name="qty_of_blood_loss")
	private String  qtyOfBloodLoss;
	@Column(name="menstrual_erregularities",nullable = true)
	private String menstrualErregularities;
	@Column(name="date_of_last_period",nullable = true)
	private String dateOfLastPeriod;
	@Column(name="menopause",nullable = true)
	private String menopause;
	@Column(name="no_of_pregnancies")
	private String  noOfPregnancies;
	@Column(name="outcome_of_pregnancies",nullable = true)
	private String outcomeOfPregnancies;
	@Column(name="complications_during_pregnancies",nullable = true)
	private String complicationsDuringPregnancies;
	@Column(name="made_of_delivery",nullable = true)
	private String made_of_delivery;
	@Column(name="last_child_birth",nullable = true)
	private String last_child_birth;
	@Column(name="string1",nullable = true)
	private String string1;
	@Column(name="string2",nullable = true)
	private String string2;
	@Column(name="string3",nullable = true)
	private String string3;
	/**
	 * @return the menstrualObstetricHistoryId
	 */
	public int getMenstrualObstetricHistoryId() {
		return menstrualObstetricHistoryId;
	}
	/**
	 * @param menstrualObstetricHistoryId the menstrualObstetricHistoryId to set
	 */
	public void setMenstrualObstetricHistoryId(int menstrualObstetricHistoryId) {
		this.menstrualObstetricHistoryId = menstrualObstetricHistoryId;
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
	 * @return the menarche
	 */
	public String getMenarche() {
		return menarche;
	}
	/**
	 * @param menarche the menarche to set
	 */
	public void setMenarche(String menarche) {
		this.menarche = menarche;
	}
	/**
	 * @return the durationOfPeriod
	 */
	public String getDurationOfPeriod() {
		return durationOfPeriod;
	}
	/**
	 * @param durationOfPeriod the durationOfPeriod to set
	 */
	public void setDurationOfPeriod(String durationOfPeriod) {
		this.durationOfPeriod = durationOfPeriod;
	}
	/**
	 * @return the qtyOfBloodLoss
	 */
	public String getQtyOfBloodLoss() {
		return qtyOfBloodLoss;
	}
	/**
	 * @param qtyOfBloodLoss the qtyOfBloodLoss to set
	 */
	public void setQtyOfBloodLoss(String qtyOfBloodLoss) {
		this.qtyOfBloodLoss = qtyOfBloodLoss;
	}
	/**
	 * @return the menstrualErregularities
	 */
	public String getMenstrualErregularities() {
		return menstrualErregularities;
	}
	/**
	 * @param menstrualErregularities the menstrualErregularities to set
	 */
	public void setMenstrualErregularities(String menstrualErregularities) {
		this.menstrualErregularities = menstrualErregularities;
	}
	/**
	 * @return the dateOfLastPeriod
	 */
	public String getDateOfLastPeriod() {
		return dateOfLastPeriod;
	}
	/**
	 * @param dateOfLastPeriod the dateOfLastPeriod to set
	 */
	public void setDateOfLastPeriod(String dateOfLastPeriod) {
		this.dateOfLastPeriod = dateOfLastPeriod;
	}
	/**
	 * @return the menopause
	 */
	public String getMenopause() {
		return menopause;
	}
	/**
	 * @param menopause the menopause to set
	 */
	public void setMenopause(String menopause) {
		this.menopause = menopause;
	}
	/**
	 * @return the noOfPregnancies
	 */
	public String getNoOfPregnancies() {
		return noOfPregnancies;
	}
	/**
	 * @param noOfPregnancies the noOfPregnancies to set
	 */
	public void setNoOfPregnancies(String noOfPregnancies) {
		this.noOfPregnancies = noOfPregnancies;
	}
	/**
	 * @return the outcomeOfPregnancies
	 */
	public String getOutcomeOfPregnancies() {
		return outcomeOfPregnancies;
	}
	/**
	 * @param outcomeOfPregnancies the outcomeOfPregnancies to set
	 */
	public void setOutcomeOfPregnancies(String outcomeOfPregnancies) {
		this.outcomeOfPregnancies = outcomeOfPregnancies;
	}
	/**
	 * @return the complicationsDuringPregnancies
	 */
	public String getComplicationsDuringPregnancies() {
		return complicationsDuringPregnancies;
	}
	/**
	 * @param complicationsDuringPregnancies the complicationsDuringPregnancies to set
	 */
	public void setComplicationsDuringPregnancies(String complicationsDuringPregnancies) {
		this.complicationsDuringPregnancies = complicationsDuringPregnancies;
	}
	/**
	 * @return the made_of_delivery
	 */
	public String getMade_of_delivery() {
		return made_of_delivery;
	}
	/**
	 * @param made_of_delivery the made_of_delivery to set
	 */
	public void setMade_of_delivery(String made_of_delivery) {
		this.made_of_delivery = made_of_delivery;
	}
	/**
	 * @return the last_child_birth
	 */
	public String getLast_child_birth() {
		return last_child_birth;
	}
	/**
	 * @param last_child_birth the last_child_birth to set
	 */
	public void setLast_child_birth(String last_child_birth) {
		this.last_child_birth = last_child_birth;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MenstrualObstetricHistory [menstrualObstetricHistoryId=" + menstrualObstetricHistoryId + ", patientId="
				+ patientId + ", menarche=" + menarche + ", durationOfPeriod=" + durationOfPeriod + ", qtyOfBloodLoss="
				+ qtyOfBloodLoss + ", menstrualErregularities=" + menstrualErregularities + ", dateOfLastPeriod="
				+ dateOfLastPeriod + ", menopause=" + menopause + ", noOfPregnancies=" + noOfPregnancies
				+ ", outcomeOfPregnancies=" + outcomeOfPregnancies + ", complicationsDuringPregnancies="
				+ complicationsDuringPregnancies + ", made_of_delivery=" + made_of_delivery + ", last_child_birth="
				+ last_child_birth + ", string1=" + string1 + ", string2=" + string2 + ", string3=" + string3 + "]";
	}
	
	 
	
	
}
