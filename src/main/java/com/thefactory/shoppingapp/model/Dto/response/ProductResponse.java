package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class ProductResponse extends Response {

    private  Long productId;
    private String productName;
    private Long categoryId;
}
