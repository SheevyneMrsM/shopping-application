package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class PaymentDto implements Serializable {

    private Long paymentId;
    private Long categoryId;
    private String paymentDate;
}
