package com.Ecommerce.eCommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer orderSize;

    @OneToOne
    @JoinColumn(name = "fk_userId")
    User user;

    @OneToOne
    @JoinColumn(name = "fk_productId")
    Product product;

    @OneToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
}