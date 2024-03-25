package com.pos.tool.domain.request;

import java.util.Date;

import com.pos.tool.domain.AppConstants;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class POSRequest {

    @NotEmpty(message = AppConstants.TOOL_CODE_BLANK_ERR_MESSAGE)
    @Size(min = 3, max = 5, message = AppConstants.TOOL_CODE_ERR_MESSAGE)
    private String toolCode;

    @Digits(fraction = 0, integer = 4, message = AppConstants.RENTAL_DAYS_ERR_MESSAGE)
    private Integer rentalDays;

    @Digits(fraction = 2, integer = 2, message = AppConstants.DISCOUNT_PERCENT_ERR_MESSAGE)
    private Double discountPercent;

    @NotNull(message = AppConstants.CHECKOUT_DATE_BLANK_ERR_MESSAGE)
    @Future(message = AppConstants.CHECKOUT_DATE_ERR_MESSAGE)
    private Date checkoutDate;

}
