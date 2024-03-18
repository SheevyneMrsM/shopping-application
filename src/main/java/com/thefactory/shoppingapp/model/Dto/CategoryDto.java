package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryDto implements Serializable {

    private Long category_id;
    private String category_name;
    private String category_type;

}
