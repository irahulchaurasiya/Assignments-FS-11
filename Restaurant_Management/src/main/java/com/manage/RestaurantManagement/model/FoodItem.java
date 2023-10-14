package com.manage.RestaurantManagement.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = FoodItem.class,property = "foodItemId")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodItemId;

    @NotBlank
    private String foodItemTitle;

    @NotBlank
    private String foodItemDesc;

    @Min(value = 50)
    @Max(value = 5000)
    private Double foodItemPrice;

    @OneToOne(mappedBy = "foodItem")
    Order order;

}
