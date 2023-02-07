package com.muhammet.service;

import com.muhammet.repository.PersonRepository;
import com.muhammet.repository.entity.Person;
import com.muhammet.utility.MyFactoryService;

public class PersonelService extends MyFactoryService<PersonRepository, Person,Long> {
    public PersonelService(){
        super(new PersonRepository());
    }
}
