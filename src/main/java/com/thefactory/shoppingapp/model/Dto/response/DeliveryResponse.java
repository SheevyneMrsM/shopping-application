package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class DeliveryResponse extends Response {


    private Long deliveriesId;
    private Long customerId;
    private String deliveryDate;


}
