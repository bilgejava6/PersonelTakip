package com.muhammet.service;

import com.muhammet.repository.AddressRepository;
import com.muhammet.repository.entity.Address;
import com.muhammet.utility.MyFactoryService;

public class AddressService extends MyFactoryService<AddressRepository, Address,Long> {
    public AddressService(){
        super(new AddressRepository());
    }
}
