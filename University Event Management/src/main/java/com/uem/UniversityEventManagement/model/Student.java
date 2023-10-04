package com.uem.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Pattern;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Student")
public class Student {

    @Id
    private Long studentId;

    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name should start with a capital letter")
    private String firstName;

    private String lastName;

    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 25, message = "Age should not exceed 25")
    private int age;

    @NotNull(message = "Department cannot be null")
    @Enumerated(EnumType.STRING)
    private Department department;
}
