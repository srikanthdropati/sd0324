package com.pos.tool.domain;

public interface AppConstants {

    String TOOL_CODE_ERR_MESSAGE = "The length of Tool Code must be between 3 and 5 characters.";
    String TOOL_CODE_BLANK_ERR_MESSAGE = "The Tool Code is required.";
    String RENTAL_DAYS_ERR_MESSAGE = "Rental day count is not 1 or greater.";
    String DISCOUNT_PERCENT_ERR_MESSAGE = "Discount percent is not in the range 0-100.";
    String CHECKOUT_DATE_ERR_MESSAGE = "The Checkout Date must be in the Future.";
    String CHECKOUT_DATE_BLANK_ERR_MESSAGE = "The Checkout Date is required.";

    // Data Tables
    String BRAND_TABLE = "Brand.csv";
    String TOOLS_TABLE = "Tools.csv";

    // Rental Agreement
    String TOOL_CODE = "Tool Code: ";
    String TOOL_TYPE = "Tool Type: ";
    String TOOL_BRAND = "Tool Brand: ";
    String RENTAL_DAYS = "Rental Days: ";
    String CHECKOUT_DATE = "Checkout Date: ";
    String DAILY_RENTAL_CHARGE = "Daily Rental Charge: ";
    String DISCOUNT_PERCENT = "Discount Percent: ";
    String WEEKDAY_CHARGE = "Weekday Charge: ";
    String WEEKEND_CHARGE = "Weekend Charge: ";
    String HOLIDAY_CHARGE = "Holiday Charge: ";
    String CHARGE_DAYS = "Charge Days: ";
    String PREDISCOUNT_CHARGE = "Prediscount Charge: $";
    String DISCOUNT_AMOUNT = "Discount Amount: $";
    String FINAL_CHARGE = "Final Charge: $";
}
