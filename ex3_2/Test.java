package ex3_2;

public class Test {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3); // 3x^2 + 2x + 1
        MyPolynomial p2 = new MyPolynomial(4, 5); // 5x + 4

        System.out.println("p1: " + p1); // In ra: 3.0x^2 + 2.0x + 1.0
        System.out.println("p2: " + p2); // In ra: 5.0x + 4.0

        System.out.println("p1 + p2: " + p1.add(p2)); // In ra: 3.0x^2 + 7.0x + 5.0
        System.out.println("p1 * p2: " + p1.multiply(p2)); // In ra: 15.0x^3 + 22.0x^2 + 13.0x + 4.0

        double x = 2;
        System.out.println("p1(" + x + ") = " + p1.evaluate(x)); // In ra: p1(2.0) = 17.0
    }
}
