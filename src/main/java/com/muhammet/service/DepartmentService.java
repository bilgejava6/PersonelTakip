package com.muhammet.service;

import com.muhammet.repository.DepartmentRepository;
import com.muhammet.repository.entity.Department;
import com.muhammet.utility.MyFactoryService;

public class DepartmentService extends MyFactoryService<DepartmentRepository, Department,Long> {
    public DepartmentService(){
        super(new DepartmentRepository());
    }
}
