package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class SellerResponse extends Response {

    private Long sellerId;
    private Long productId;
    private String firstName;
    private String lastName;
    private String email;

}
