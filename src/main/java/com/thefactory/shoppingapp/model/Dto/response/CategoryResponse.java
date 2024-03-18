package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class CategoryResponse extends Response {
    private Long category_id;
    private String category_name;
    private String category_type;


}
