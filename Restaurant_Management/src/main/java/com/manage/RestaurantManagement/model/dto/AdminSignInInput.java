package com.manage.RestaurantManagement.model.dto;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminSignInInput {

    @Pattern(regexp = "^.+@admin\\.com$")
    private String email;
    private String password;
}
