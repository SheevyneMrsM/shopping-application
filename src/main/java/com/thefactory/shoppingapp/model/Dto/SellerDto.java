package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class SellerDto implements Serializable {

    private Long sellerId;
    private Long productId;
    private String firstName;
    private String lastName;
    private String email;

}
