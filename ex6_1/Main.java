package ex6_1;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.0, "blue", false);
        Shape s2 = new Rectangle(4.0, 6.0, "green", true);
        Shape s3 = new Square(3.0, "yellow", true);


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Tính và in diện tích và chu vi
        System.out.println("Area of s1: " + s1.getArea());
        System.out.println("Perimeter of s1: " + s1.getPerimeter());
        System.out.println("Area of s2: " + s2.getArea());
        System.out.println("Perimeter of s2: " + s2.getPerimeter());
        System.out.println("Area of s3: " + s3.getArea());
        System.out.println("Perimeter of s3: " + s3.getPerimeter());

        Shape[] shapes = new Shape[3];
        shapes[0] = s1;
        shapes[1] = s2;
        shapes[2] = s3;

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}