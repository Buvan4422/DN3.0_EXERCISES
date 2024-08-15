package com.ems.exercise9.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.exercise9.Entity.Department;
import com.ems.exercise9.Projections.DepartmentDTO;
import com.ems.exercise9.Repository.DeptRepository;
 
@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DeptRepository departmentRepo;

    // Create a new department
    @PostMapping
    public Department createDepartment(@RequestBody Department department) {
        return departmentRepo.save(department);
    }

    // Get all departments
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    // Get a department by ID
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        Optional<Department> department = departmentRepo.findById(id);
        return department.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Update an existing department
    @PutMapping("/{id}")
    public ResponseEntity<Department> updateDepartment(@PathVariable Long id, @RequestBody Department departmentDetails) {
        Optional<Department> optionalDepartment = departmentRepo.findById(id);
        if (optionalDepartment.isPresent()) {
            Department department = optionalDepartment.get();
            department.setName(departmentDetails.getName());
            return ResponseEntity.ok(departmentRepo.save(department));
        }
        return ResponseEntity.notFound().build();
    }

    // Delete a department
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Long id) {
        if (departmentRepo.existsById(id)) {
            departmentRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }



    //for projection
    @GetMapping("/dto")
    public List<DepartmentDTO> getAllDepartmentDTOs() {
        return departmentRepo.findAllDepartmentDTOs();
    }
    
}
