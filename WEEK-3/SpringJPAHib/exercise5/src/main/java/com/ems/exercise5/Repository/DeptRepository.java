package com.ems.exercise5.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ems.exercise5.Entity.Department;

public interface DeptRepository extends JpaRepository<Department,Long> {
    @Query(name="departments.findByName")
    Department findByName(@Param("name")String name);

   @SuppressWarnings("null")
    Optional<Department> findById(@Param("id")Long id);
}
