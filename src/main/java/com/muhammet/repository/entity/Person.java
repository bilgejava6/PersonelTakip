package com.muhammet.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblperson")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer age;
    Gender gender;
    /**
     * OneToMany -> Personel tablosunun Adres tablosuna ilişkisini tanımlar
     * birden çoğa ilişki ayrıbir bağlantı tablosu ile sağlanır böylece yeni bir
     * tablo yaratılır.
     * CascadeType -> Personel tablosu oluşmak için adres bilgilerine ihtiyaç duyduğu için
     * eğer adresler DB de yok ise onları create etme yetkisini devralır.
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tbl_personel_adres_iliski",
               joinColumns = @JoinColumn(name = "personelid"),
               inverseJoinColumns = @JoinColumn(name = "adresid")
    )
    List<Address> addresses;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "arabaidsiiiii")
    Car car;
    /**
     * department_id
     */
    @ManyToOne(cascade = CascadeType.ALL)
    Department department;
}
