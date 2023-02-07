package com.muhammet.repository;

import com.muhammet.repository.entity.Car;
import com.muhammet.utility.MyFactoryRepository;

public class CarRepository extends MyFactoryRepository<Car,Long> {
    public CarRepository(){
        super(new Car());
    }
}
