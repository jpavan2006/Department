package com.pavan.department.service;

import com.pavan.department.entity.Department;
import com.pavan.department.repository.DepartmentRepository;
import javassist.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment (Department  department){
        log.info("Inside saveDepartment method of Department Service");
        return departmentRepository.save(department);
    }

    public Optional<Department> findDepartmentById (Long  departmentId){
        log.info("Inside findDepartmentById method of Department Service");

            return  departmentRepository.findById(departmentId);


    }
}
