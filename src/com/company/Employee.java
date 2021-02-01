package com.company;

public class Employee {

	private String name;
	private double salary;
	private Position position;
	private Section section;

	public Employee(String name, double salary, Position position, Section section) {
		this.name = name;
		this.position = position;
		this.section = section;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
}