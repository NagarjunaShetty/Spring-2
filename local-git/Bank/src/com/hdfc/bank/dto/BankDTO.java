package com.hdfc.bank.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_dto")
public class BankDTO implements Serializable{
	
	@Override
	public String toString() {
		return "BankDTO [bankId=" + bankId + ", bankName=" + bankName + ", bankLocation=" + bankLocation + ", bankType="
				+ bankType + "]";
	}

	@Id
	@Column(name="bank_id")
	private String bankId;
	@Column(name="bank_name")
	private String bankName;
	@Column(name="bank_location")
	private String bankLocation;
	@Column(name="bank_type")
	private String bankType;
	
	
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	
	public BankDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
}
