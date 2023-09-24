package com.example.userManagementSystem.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Name cannot be blank")
    private String userName;

    @NotNull(message = "Date of Birth cannot be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Email(message = "Enter a valid email")
    private String email;

    @Pattern(regexp = "\\d{2}-\\d{10}")
    private String phoneNumber;

    private LocalDateTime dateTime;
}
