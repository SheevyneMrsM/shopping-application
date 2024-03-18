package com.thefactory.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long customer_id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "contact_details")
    private String  contactDetails;

    @Column(name = "address")
    private String address;

    @Column(name = "email_address")
    private String emailAddress;
}
