package com.ems.exercise4.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.exercise4.Entity.Department;


public interface DeptRepository extends JpaRepository<Department,Long> {
    Department findByName(String name);
   @SuppressWarnings("null")
    Optional<Department> findById(Long id);
}