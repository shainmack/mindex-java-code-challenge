package com.mindex.challenge.data;

public class ReportingStructure {
	private int numberOfReports;
	private Employee employee;

	public ReportingStructure(Employee employee) {
		this.employee = employee;
	}

	public void setNumberOfReports(int numberOfReports) {
		this.numberOfReports = numberOfReports;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getNumberOfReports() {
		return this.numberOfReports;
	}

	public Employee getEmployee() {
		return this.employee;
	}
}