package com.hexaware.hibernate2.com.hexaware.hibernate2;

import javax.persistence.Embeddable;

@Embeddable
public class Result {
	int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	String subject;
}
