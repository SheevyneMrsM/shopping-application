package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductDto implements Serializable {

    private  Long productId;
    private String productName;
    private Long categoryId;

}
