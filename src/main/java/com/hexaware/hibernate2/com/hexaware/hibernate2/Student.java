package com.hexaware.hibernate2.com.hexaware.hibernate2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	int rollNo;
	
	@Column
	String name;
	
	@Column 
	double fee;
	
	@Column
	Result res;

	public Result getRes() {
		return res;
	}

	public void setRes(Result res) {
		this.res = res;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fee=" + fee + ", res=" + res + "]";
	}
	
	
}
