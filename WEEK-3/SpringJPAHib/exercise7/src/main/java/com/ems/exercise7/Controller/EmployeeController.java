package com.ems.exercise7.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ems.exercise7.Entity.Employee;
import com.ems.exercise7.Service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

     @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public Page<Employee> getEmployees(
            @RequestParam String departmentName,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortDir), sortBy));
        return employeeService.getEmployeesByDepartment(departmentName, pageable);
    }
}
