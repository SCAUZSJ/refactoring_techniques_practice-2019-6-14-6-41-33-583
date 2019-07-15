package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    public static final int DISCOUNT_MAX = 500;
    public static final double DUSCIYBT_RATE = 0.05;
    public static final double SHIPPING_COST_MAX = 100.0;
    public static final double SHIPPING_COST_RATE = 0.1;

    double getPrice(int quantity, int itemPrice) {
        int basePrice = quantity * itemPrice;
        Double discount =  Math.max(0, quantity - DISCOUNT_MAX) * itemPrice * DUSCIYBT_RATE;
        Double shippingCost = Math.min(quantity * itemPrice * SHIPPING_COST_RATE, SHIPPING_COST_MAX);
        return basePrice - discount + shippingCost;

    }
}
