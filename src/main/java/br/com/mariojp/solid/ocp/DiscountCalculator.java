package br.com.mariojp.solid.ocp;

public class DiscountCalculator {
    public double apply(double amount, CustomerType type) {
    	amount = amount * type.tax;
        return amount;
    }
}
