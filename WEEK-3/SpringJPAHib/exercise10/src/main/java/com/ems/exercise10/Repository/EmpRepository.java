package com.ems.exercise10.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.exercise10.Entity.Employee;
import com.ems.exercise10.Projections.EmployeeDTO;

public interface EmpRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByName(String name);

    Employee findByEmail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findEmployeeByEmail(String email);

    @SuppressWarnings("null")
    @Query(name="Employee.findById")
    Optional<Employee> findById(Long id);
    
    // Pagination and sorting example
    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);

    //Projections
    @Query("SELECT new com.ems.exercise10.EmployeeDTO(e.name, e.email) FROM Employee e WHERE e.department.name = ?1")
    List<EmployeeDTO> findEmployeeDTOsByDepartmentName(String departmentName);
}
