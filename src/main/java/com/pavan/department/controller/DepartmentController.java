package com.pavan.department.controller;

import com.pavan.department.entity.Department;
import com.pavan.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment (@RequestBody Department  department){
        log.info("Inside saveDepartment method of Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Optional<Department> findDepartmentById (@PathVariable("id") Long  departmentId){
        log.info("Inside findDepartmentById method of Department Controller");
        return departmentService.findDepartmentById(departmentId);
    }
}
