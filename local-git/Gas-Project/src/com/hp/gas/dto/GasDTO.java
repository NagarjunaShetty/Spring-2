      package com.hp.gas.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gas_dto")
public class GasDTO implements Serializable
{
	@Id
	@Column(name="Gas_Number")
	private int gasNumber;
	
	@Column(name="Gas_Name")
	private String gasName;
	
	@Column(name="Gas_Cost")
	private int cost;
	
	public GasDTO()
	{
		System.out.println(this.getClass().getSimpleName() +"Created");
		// TODO Auto-generated constructor stub
	}
	
	public int getGasNumber() {
		return gasNumber;
	}

	public void setGasNumber(int gasNumber) {
		this.gasNumber = gasNumber;
	}

	public String getGasName() {
		return gasName;
	}

	public void setGasName(String gasName) {
		this.gasName = gasName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "GasDTO [gasNumber=" + gasNumber + ", gasName=" + gasName + ", cost=" + cost + "]";
	}
}
