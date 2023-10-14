package com.manage.RestaurantManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    @NotBlank
    private String adminName;

    @Pattern(regexp = "^.+@admin\\.com$")
    private String adminEmail;

    @Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z]).{6,}$")
    private String adminPassword;

}
