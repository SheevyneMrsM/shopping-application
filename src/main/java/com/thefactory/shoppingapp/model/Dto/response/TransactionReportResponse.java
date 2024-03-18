package com.thefactory.shoppingapp.model.Dto.response;

import com.thefactory.shoppingapp.common.Response;
import lombok.Data;

@Data
public class TransactionReportResponse extends Response {

    private Long reportId;
    private Long customerId;
    private Long orderId;
    private Long productId;
    private String paymentId;
}
