package com.thefactory.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "deliveries")
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deliveriesId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "delivery_date")
    private String deliveryDate;


}
