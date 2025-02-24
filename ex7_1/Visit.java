package ex7_1;

public class Visit {
    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double serviceDiscount = getServiceDiscount();
        double productDiscount = getProductDiscount();
        return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
    }

    public double getServiceDiscount() {
        double discountRate = DiscountRate.getServiceDiscountRate(customer.getMemberType());
        return serviceExpense * discountRate;
    }

    public double getProductDiscount() {
        double discountRate = DiscountRate.getProductDiscountRate(customer.getMemberType());
        return productExpense * discountRate;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date='" + date + '\'' +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}