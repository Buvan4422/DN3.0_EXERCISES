package com.ems.exercise3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.exercise3.Entity.Department;
import com.ems.exercise3.Entity.Employees;

public interface EmpRepository extends JpaRepository<Employees,Long> {
    List<Employees> findByName(String name);
    List<Employees> findByDepartment(Department department);
    @SuppressWarnings("null")
    Optional<Employees> findById(Long id);
    List<Employees> findByEmail(String email);

}
