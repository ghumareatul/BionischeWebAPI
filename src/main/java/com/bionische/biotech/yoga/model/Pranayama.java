package com.bionische.biotech.yoga.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pranayama")

public class Pranayama {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="pranayamtype_id")
	private int pranayamaTypeId;
	
	@Column(name="pranayama_name")
    private String pranayamaName;
	
	@Column(name="int_1")
private int int1;
	
	@Column(name="int_2")
private int int2;
	
	@Column(name="string1")
private String string1;
	
	@Column(name="string2")
private String string2;
	
	@Column(name="del_status")
private int  delStatus;

	public int getPranayamaTypeId() {
		return pranayamaTypeId;
	}

	public void setPranayamaTypeId(int pranayamaTypeId) {
		this.pranayamaTypeId = pranayamaTypeId;
	}

	
	public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}

	public int getInt2() {
		return int2;
	}

	public void setInt2(int int2) {
		this.int2 = int2;
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

	public int getDelStatus() {
		return delStatus;
	}

	public void setDelStatus(int delStatus) {
		this.delStatus = delStatus;
	}

	public String getPranayamaName() {
		return pranayamaName;
	}

	public void setPranayamaName(String pranayamaName) {
		this.pranayamaName = pranayamaName;
	}

	@Override
	public String toString() {
		return "Pranayama [pranayamaTypeId=" + pranayamaTypeId + ", pranayamaName=" + pranayamaName + ", int1=" + int1
				+ ", int2=" + int2 + ", string1=" + string1 + ", string2=" + string2 + ", delStatus=" + delStatus + "]";
	}

	
	
	
	
	
	
	
}
