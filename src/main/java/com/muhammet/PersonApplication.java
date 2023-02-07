package com.muhammet;

import com.muhammet.repository.entity.*;
import com.muhammet.service.AddressService;
import com.muhammet.service.DepartmentService;
import com.muhammet.service.PersonelService;

import java.util.ArrayList;
import java.util.List;

public class PersonApplication {
    public static void main(String[] args) {
        List<Address> adreslistesi = new ArrayList<>();
        adreslistesi.add(Address.builder().city("Ankara").build());
        adreslistesi.add(Address.builder().city("Istanbul").build());
        adreslistesi.add(Address.builder().city("Bolu").build());
        //AddressService addressService = new AddressService();
        //addressService.saveAll(adreslistesi);
        Car car = Car.builder().marka("Mercedes").build();
        Department department = Department.builder().name("Muhasebe").build();
        Person person = Person.builder()
                .age(56)
                .name("Muhammet")
                .gender(Gender.M)
                .addresses(adreslistesi)
                .car(car)
                .department(department)
                .build();
        Person person2 = Person.builder()
                .age(56)
                .name("Ali")
                .gender(Gender.M)
                .department(department)
                .build();
        Person person3 = Person.builder()
                .age(56)
                .name("Deniz")
                .gender(Gender.F)
                .department(department)
                .build();

//        PersonelService personelService = new PersonelService();
//        personelService.save(person);
        //Alternatif kullanım
        new PersonelService().save(person);
        new PersonelService().save(person2);
        new PersonelService().save(person3);

       new DepartmentService().findAll().forEach(x->{
           System.out.println(x.getName());
           x.getPersonList().forEach(p->{
               System.out.println(p.getId()+" -> "+p.getName());
           });
       });

    }
}