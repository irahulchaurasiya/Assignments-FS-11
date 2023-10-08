package com.map.mappingPractise.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    private String addressId;

    private String addressLandmark;


    private String addressZipcode;

    private String addressDistrict;
    private String addressState;
    private String addressCountry;


}