package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class AddressResponse extends Response {


    private  Long id;
    private String streetAddress;
    private String suburb;
    private String city;
    private String province;
    private String latitude;
    private String longitude;
}
