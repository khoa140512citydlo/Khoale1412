package ex4_5;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5.0, "blue", true);
        System.out.println(square);
        square.setSide(10.0);
        System.out.println(square);
    }
}
