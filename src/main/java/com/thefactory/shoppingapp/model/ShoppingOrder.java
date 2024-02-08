package com.thefactory.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "shopping_order")
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;

    @Column(name = "customer_id")
    private String customer_id;

    @Column(name = "shopping_date")
    private String shopping_date;
}
