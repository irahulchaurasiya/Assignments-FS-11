package com.example.jobSearch.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Job")
public class Job {

    @Id
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotBlank
    private String location;

    @Min(value = 20000, message = "Salary should be above 20,000")
    private Double salary;

    @NotBlank
    @Email
    private String companyEmail;

    @NotBlank
    private String companyName;

    @NotBlank
    private String employerName;

    @Enumerated(EnumType.STRING)
    private Type jobType;

    private LocalDate appliedDate;
}
