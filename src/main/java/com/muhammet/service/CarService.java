package com.muhammet.service;

import com.muhammet.repository.CarRepository;
import com.muhammet.repository.entity.Car;
import com.muhammet.utility.MyFactoryService;

public class CarService extends MyFactoryService<CarRepository, Car,Long> {
    public CarService(){
        super(new CarRepository());
    }
}
