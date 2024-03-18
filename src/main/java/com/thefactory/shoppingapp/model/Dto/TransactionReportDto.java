package com.thefactory.shoppingapp.model.Dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class TransactionReportDto implements Serializable {

    private Long reportId;
    private Long customerId;
    private Long orderId;
    private Long productId;
    private String paymentId;



}
