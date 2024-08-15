package com.ems.exercise10.Projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {
    
    // Projection of specific fields
    @Value("#{target.name} #{target.email}")
    String getEmployeeDetails();

    String getName();
    String getEmail();
}
