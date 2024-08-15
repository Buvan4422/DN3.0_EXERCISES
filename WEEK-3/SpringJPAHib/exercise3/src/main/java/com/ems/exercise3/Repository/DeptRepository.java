package com.ems.exercise3.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.exercise3.Entity.Department;


public interface DeptRepository extends JpaRepository<Department,Long> {
    List<Department> findByName(String name);
   @SuppressWarnings("null")
    Optional<Department> findById(Long id);
    
}
