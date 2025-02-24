package ex3_1;
import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số phức thứ nhất (phần thực và phần ảo): ");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        MyComplex num1 = new MyComplex(real1, imag1);


        System.out.print("Nhập số phức thứ hai (phần thực và phần ảo): ");
        double real2 = scanner.nextDouble();
        double imag2 = scanner.nextDouble();
        MyComplex num2 = new MyComplex(real2, imag2);


        System.out.println("Số phức thứ nhất là: " + num1);
        System.out.println("Số phức thứ hai là: " + num2);


        System.out.println(num1 + " có phải là số thực không? " + num1.isReal());
        System.out.println(num1 + " có phải là số ảo không? " + num1.isImaginary());
        System.out.println(num2 + " có phải là số thực không? " + num2.isReal());
        System.out.println(num2 + " có phải là số ảo không? " + num2.isImaginary());
        System.out.println(num1 + " có bằng " + num2 + " không? " + num1.equals(num2));


        System.out.println("[" + num1 + " + " + num2 + "] = " + num1.addNew(num2));
    }
}
