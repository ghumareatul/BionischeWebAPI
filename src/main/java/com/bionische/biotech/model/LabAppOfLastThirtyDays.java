package com.bionische.biotech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.bionische.biotech.Common.DateConverter;

@Entity
public class LabAppOfLastThirtyDays {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="total_app")
	private int totalApp;
	
	@Column(name="app_date")
	private String appDate;

	public String getAppDate() {
		return DateConverter.convertToDMY(appDate);
	}

	public void setAppDate(String appDate) {
		this.appDate = appDate;
	}

	public int getTotalApp() {
		return totalApp;
	}

	public void setTotalApp(int totalApp) {
		this.totalApp = totalApp;
	}

	@Override
	public String toString() {
		return "DoctorAppOfLastThirtyDays [appDate=" + appDate + ", totalApp=" + totalApp + "]";
	}
	

}
