package ex7_1;

public class DiscountRate {
    private static final double SERVICE_DISCOUNT_RATE = 0.1;
    private static final double PRODUCT_DISCOUNT_RATE = 0.05;

    public static double getServiceDiscountRate(String memberType) {
        switch (memberType) {
            case "Premium":
                return 0.2;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.1;
            default:
                return SERVICE_DISCOUNT_RATE;
        }
    }

    public static double getProductDiscountRate(String memberType) {
        switch (memberType) {
            case "Premium":
                return 0.1;
            case "Gold":
                return 0.075;
            case "Silver":
                return 0.05;
            default:
                return PRODUCT_DISCOUNT_RATE;
        }
    }
}
