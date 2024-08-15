package com.ems.exercise8.Projections;

import lombok.Value;

@Value
public class DepartmentDTO {
    
    private final String name;
    private final int employeeCount;
    
    public DepartmentDTO(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}
