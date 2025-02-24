package ex7_1;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "Premium");
        Visit visit = new Visit(customer, "2023-10-27");

        visit.setServiceExpense(100);
        visit.setProductExpense(200);

        System.out.println(visit);
        System.out.println("Total expense: " + visit.getTotalExpense());
    }
}
