package com.mindex.challenge.data;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Compensation {
	private String employeeId;
	private float salary;

	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date effectiveDate;

	public Compensation() {
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setEffectiveDate(Date date) {
		this.effectiveDate = date;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public float getSalary() {
		return this.salary;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

}