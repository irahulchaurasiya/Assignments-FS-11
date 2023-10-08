package com.map.mappingPractise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    private String studentId;

    private String studentName;
    private String studentAge;
    private String studentPhoneNumber;
    private String studentBranch;
    private String StudentDepartment;

    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

}