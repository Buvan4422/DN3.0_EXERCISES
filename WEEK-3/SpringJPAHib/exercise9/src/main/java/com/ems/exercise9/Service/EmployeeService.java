package com.ems.exercise9.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ems.exercise9.Entity.Employee;
import com.ems.exercise9.Projections.EmployeeDTO;
import com.ems.exercise9.Projections.EmployeeProjection;
import com.ems.exercise9.Repository.EmpRepository;

@Service
public class EmployeeService {

   @Autowired
    private EmpRepository employeeRepository;

    public Page<Employee> getEmployeesByDepartment(String departmentName, Pageable pageable) {
        return employeeRepository.findByDepartmentName(departmentName, pageable);
    }

    public List<EmployeeProjection> findEmployeesByDepartmentName(String departmentName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEmployeesByDepartmentName'");
    }

    public List<EmployeeDTO> findEmployeeDTOsByDepartmentName(String departmentName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findEmployeeDTOsByDepartmentName'");
    }
}
