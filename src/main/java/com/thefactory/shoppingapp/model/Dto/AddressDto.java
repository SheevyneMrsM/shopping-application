package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class AddressDto implements Serializable {

    private  Long id;
    private String streetAddress;
    private String suburb;
    private String city;
    private String province;
    private String latitude;
    private String longitude;
}
