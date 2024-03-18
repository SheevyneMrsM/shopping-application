package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class ShoppingOrderResponse extends Response {

    private Long order_id;
    private String customer_id;
    private String shopping_date;
}
