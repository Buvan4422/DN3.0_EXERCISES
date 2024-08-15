package com.ems.exercise7.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ems.exercise7.Entity.Employee;
import com.ems.exercise7.Repository.EmpRepository;

@Service
public class EmployeeService {

   @Autowired
    private EmpRepository employeeRepository;

    public Page<Employee> getEmployeesByDepartment(String departmentName, Pageable pageable) {
        return employeeRepository.findByDepartmentName(departmentName, pageable);
    }
}
