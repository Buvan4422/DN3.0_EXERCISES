package com.ems.exercise6.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.exercise6.Entity.Department;

public interface DeptRepository extends JpaRepository<Department,Long> {
    @Query(name="Department.findByName")
    Optional<Department> findByName(String name);
   @SuppressWarnings("null")
    Optional<Department> findById(Long id);
}