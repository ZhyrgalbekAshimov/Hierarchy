package com.company;

public class Main {

	public static void main(String[] args){

		Company company = new Company ("Toiboss");

		Directorate directorate = new Directorate ("Sales", company);

		Department department = new Department ("Analyze", directorate);

		Section section = new Section("Finance", department);

		Position position = new Position ("Sales", section);

		Employee employee = new Employee ("Zhyrgalbek Ashimov", 20000, position, section);


        System.out.println("Employee name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Position: " + employee.getPosition().getName());
        System.out.println("Section: " + employee.getSection().getName());
        System.out.println("Department: " + employee.getSection().getDepartment().getName());
        System.out.println("Directorate: " + employee.getSection().getDepartment().getDirectorate().getName());
        System.out.println("Company: " + employee.getSection().getDepartment().getDirectorate().getCompany().getName());


	}
}

