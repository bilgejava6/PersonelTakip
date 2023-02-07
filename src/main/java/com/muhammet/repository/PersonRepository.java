package com.muhammet.repository;

import com.muhammet.repository.entity.Person;
import com.muhammet.utility.MyFactoryRepository;

public class PersonRepository extends MyFactoryRepository<Person,Long> {
    public PersonRepository(){
        super(new Person());
    }
}
