package com.bionische.biotech.stemcell.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stemcellbank_details")

public class StemCellBankDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="stemcellbank_id")  
	private int stemCellBankId;
	
	
	@Column(name="stemcellbank_name")
   private String stemCellBankName;
	     
	
	@Column(name="owner")
   private String stemCellOwnerName;
	
	
	@Column(name="city_id")
   private int stemCellBankcityId;
	    
	
	@Column(name="address")
   private String stemCellBankAddress;
	
	
	@Column(name="contact1")
   private String contact1;
	
	
	@Column(name="contact2")
    private String contact2;
	
	
	@Column(name="state")
   private String state;
	
	
	@Column(name="country")
   private String country;
	
	
	@Column(name="email_id")
   private String emailId;
	
	
	@Column(name="photo")
   private String photo;
	
	
	@Column(name="int_1")
   private int int1;
	
	
	@Column(name="int_2")
   private int int2;
	
	
	@Column(name="del_status")
   private int delstatus;   
	
	
	
	@Column(name="string1")
	private String string1;
	
		
		@Column(name="string2")
	private String string2;


	
	
	
	public int getStemCellBankId() {
		return stemCellBankId;
	}

	public void setStemCellBankId(int stemCellBankId) {
		this.stemCellBankId = stemCellBankId;
	}

	public String getStemCellBankName() {
		return stemCellBankName;
	}

	public void setStemCellBankName(String stemCellBankName) {
		this.stemCellBankName = stemCellBankName;
	}

	public String getStemCellOwnerName() {
		return stemCellOwnerName;
	}

	public void setStemCellOwnerName(String stemCellOwnerName) {
		this.stemCellOwnerName = stemCellOwnerName;
	}

	public int getStemCellBankcityId() {
		return stemCellBankcityId;
	}

	public void setStemCellBankcityId(int stemCellBankcityId) {
		this.stemCellBankcityId = stemCellBankcityId;
	}

	public String getStemCellBankAddress() {
		return stemCellBankAddress;
	}

	public void setStemCellBankAddress(String stemCellBankAddress) {
		this.stemCellBankAddress = stemCellBankAddress;
	}

	public String getContact1() {
		return contact1;
	}

	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}

	public String getContact2() {
		return contact2;
	}

	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
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

	public int getDelstatus() {
		return delstatus;
	}

	public void setDelstatus(int delstatus) {
		this.delstatus = delstatus;
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

	

	@Override
	public String toString() {
		return "StemCellBankDetails [stemCellBankId=" + stemCellBankId + ", stemCellBankName=" + stemCellBankName
				+ ", stemCellOwnerName=" + stemCellOwnerName + ", stemCellBankcityId=" + stemCellBankcityId
				+ ", stemCellBankAddress=" + stemCellBankAddress + ", contact1=" + contact1 + ", contact2=" + contact2
				+ ", state=" + state + ", country=" + country + ", emailId=" + emailId + ", photo=" + photo + ", int1="
				+ int1 + ", int2=" + int2 + ", delstatus=" + delstatus + ", string1=" + string1 + ", string2=" + string2
				+ "]";
	}

	

	

	

}
