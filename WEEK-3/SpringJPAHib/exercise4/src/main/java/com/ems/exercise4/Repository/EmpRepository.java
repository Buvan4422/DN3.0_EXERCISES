package com.ems.exercise4.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.exercise4.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long> {
        @SuppressWarnings("null")
        Optional<Employee> findById(Long id);
        Employee findByEmail(String email);
}
