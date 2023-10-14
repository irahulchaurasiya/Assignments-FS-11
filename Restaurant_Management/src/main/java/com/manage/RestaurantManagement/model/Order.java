package com.manage.RestaurantManagement.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.manage.RestaurantManagement.model.enums.OrderStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Purchase_Order")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,scope = Order.class,property = "orderId")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @Min(value = 1)
    @Max(value = 10)
    private Integer orderQuantity;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private OrderStatus status;

    @JsonProperty(access = JsonProperty.Access.READ_ONLY) // hide this in json but not in database table column
    private LocalDateTime orderCreationTime;

    @ManyToOne
    @JoinColumn(name = "fk_User_Id")
    User user;

    @OneToOne
    @JoinColumn(name = "fk_Food_Item_Id")
    FoodItem foodItem;
}
