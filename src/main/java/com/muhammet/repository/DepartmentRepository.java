package com.muhammet.repository;

import com.muhammet.repository.entity.Department;
import com.muhammet.utility.MyFactoryRepository;

public class DepartmentRepository extends MyFactoryRepository<Department,Long> {
    public DepartmentRepository(){
        super(new Department());
    }
}
