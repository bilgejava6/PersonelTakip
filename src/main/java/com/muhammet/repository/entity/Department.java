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
@Table(name = "tbldepartment")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    /**
     * select* from tblperson where department_id = ?
     */
    @OneToMany(mappedBy = "department")
    List<Person> personList;
}
