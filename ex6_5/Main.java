package ex6_5;
public class Main {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(5.0);
        System.out.println(circle);

        circle.resize(50);
        System.out.println(circle);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
