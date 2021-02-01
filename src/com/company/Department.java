package com.company;

public class Department {

    private String name;
    private String managerName;
    private Directorate directorate;

    public Department(String name, Directorate directorate) {
        this.name = name;
        this.directorate = directorate;
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

    public Directorate getDirectorate() {
        return directorate;
    }

    public void setDirectorate(Directorate directorate) {
        this.directorate = directorate;
    }
}