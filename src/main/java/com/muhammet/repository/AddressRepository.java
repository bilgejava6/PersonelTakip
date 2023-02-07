package com.muhammet.repository;

import com.muhammet.repository.entity.Address;
import com.muhammet.utility.MyFactoryRepository;


public class AddressRepository extends MyFactoryRepository<Address,Long> {
    public AddressRepository(){
        super(new Address());
    }
}
