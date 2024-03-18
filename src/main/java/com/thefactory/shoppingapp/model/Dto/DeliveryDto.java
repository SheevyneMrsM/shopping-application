package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class DeliveryDto implements Serializable {

    private Long deliveriesId;
    private Long customerId;
    private String deliveryDate;


}
