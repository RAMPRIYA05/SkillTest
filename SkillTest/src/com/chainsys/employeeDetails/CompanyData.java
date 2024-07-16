package com.chainsys.employeeDetails;

public class CompanyData {
	String companyName;
    String employees;
    int numEmployees;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmployees() {
		return employees;
	}
	public void setEmployees(String employees) {
		this.employees = employees;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
	public void setNumEmployees(int numEmployees) {
		this.numEmployees = numEmployees;
	}
	@Override
	public String toString() {
		return "CompanyData [companyName=" + companyName + ", employees=" + employees + ", numEmployees=" + numEmployees
				+ "]";
	}
	public CompanyData(String companyName, String employees, int numEmployees) {
		super();
		this.companyName = companyName;
		this.employees = employees;
		this.numEmployees = numEmployees;
	}
    
    
}
