package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class CustomerResponse extends Response {

    private Long customer_id;
    private String firstName;
    private String lastName;
    private String  contactDetails;
    private String address;
    private String emailAddress;


}
