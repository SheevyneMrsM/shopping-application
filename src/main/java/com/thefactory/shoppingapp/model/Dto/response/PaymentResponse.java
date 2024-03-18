package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class PaymentResponse extends Response {

    private Long paymentId;
    private Long categoryId;
    private String paymentDate;
}
