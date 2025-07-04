package Functional_Interfaces;

public class Discount {

    @FunctionalInterface
    interface Discounts {
        double apply(double price);
    }

    public static double getFinalPrice(double price, Discounts discount) {
        return discount.apply(price);
    }

    public static void main(String[] args) {
        double originalPrice = 1000.0;

        double studentPrice = getFinalPrice(originalPrice, p -> p * 0.8);
        double premiumPrice = getFinalPrice(originalPrice, p -> p * 0.9);
        double noDiscountPrice = getFinalPrice(originalPrice, p -> p);

        System.out.println("Original Price: " + originalPrice);
        System.out.println("Student Price : " + studentPrice);
        System.out.println("Premium Price : " + premiumPrice);
        System.out.println("No Discount   : " + noDiscountPrice);
    }
}

