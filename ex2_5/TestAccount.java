package ex2_5;

public class TestAccount {
        public static void main(String[] args) {
            Customer customer1 = new Customer(1, "John Doe", 'M');
            Account account1 = new Account(101, customer1, 5000.0);


            System.out.println(account1);

            account1.deposit(2000.0);
            System.out.println(account1);

            account1.withdraw(3000.0);
            System.out.println(account1);

            account1.withdraw(10000.0);
            System.out.println(account1);

    }
}
