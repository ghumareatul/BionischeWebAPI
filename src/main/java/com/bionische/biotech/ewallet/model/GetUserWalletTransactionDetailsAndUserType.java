package com.bionische.biotech.ewallet.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

public class GetUserWalletTransactionDetailsAndUserType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transaction_id")
	int transactionId;
	
	@Column(name = "from_user_id")
	int fromUserId;
	
	@Column(name = "user_type")
	int userType;
	
	@Column(name = "wallet_id")
	int walletId;
	
	@Column(name = "transaction_type")
	int transactionType;
	
	@Column(name = "amount")
	float amount;
	
	@Column(name = "to_user_id")
	int toUserId;
	
	@Column(name="created_date",updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date createDate;
	
	@Column(name="last_modified_date")
	@LastModifiedDate
	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	private Date lastModifiedDate;
	
	@Column(name="to_user_type")
	private int toUserType;

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(int fromUserId) {
		this.fromUserId = fromUserId;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public int getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(int transactionType) {
		this.transactionType = transactionType;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getToUserId() {
		return toUserId;
	}

	public void setToUserId(int toUserId) {
		this.toUserId = toUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getToUserType() {
		return toUserType;
	}

	public void setToUserType(int toUserType) {
		this.toUserType = toUserType;
	}

	@Override
	public String toString() {
		return "GetUserWalletTransactionDetailsAndUserType [transactionId=" + transactionId + ", fromUserId="
				+ fromUserId + ", userType=" + userType + ", walletId=" + walletId + ", transactionType="
				+ transactionType + ", amount=" + amount + ", toUserId=" + toUserId + ", createDate=" + createDate
				+ ", lastModifiedDate=" + lastModifiedDate + ", toUserType=" + toUserType + "]";
	}

	
	
}
