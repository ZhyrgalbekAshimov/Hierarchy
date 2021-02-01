package com.company;

public class Directorate {

	private String name;
	private String managerName;
	private Company company;

	public Directorate(String name, Company company) {
		this.name = name;
		this.company = company;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}