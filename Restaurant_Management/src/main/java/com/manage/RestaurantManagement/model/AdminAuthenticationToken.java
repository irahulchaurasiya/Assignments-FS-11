package com.manage.RestaurantManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdminAuthenticationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tokenId;
    private String tokenValue;
    private LocalDateTime tokenCreationDateTime;

    //mapping
    @OneToOne
    @JoinColumn(name = "fk_Admin_Id")
    Admin admin;


    //create a parameterized constructor which takes admin as an argument
    public AdminAuthenticationToken(Admin admin)
    {
        this.admin = admin;
        this.tokenValue = UUID.randomUUID().toString();
        this.tokenCreationDateTime = LocalDateTime.now();
    }
}
