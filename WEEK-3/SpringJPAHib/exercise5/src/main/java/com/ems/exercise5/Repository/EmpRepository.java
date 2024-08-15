package com.ems.exercise5.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ems.exercise5.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee,Long> {
    @SuppressWarnings("null")
    @Query(name="Employee.findById")
    Optional<Employee> findById(@Param("id") Long id);

    @Query("select e from employee e where e.email =:email")
    Employee findByEmail(String email);

    @SuppressWarnings("null")
    @Query("Select e from employee")
    List<Employee> findAll();
}
