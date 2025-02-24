package ex6_2;

public class Main {
    public static void main(String[] args) {

        GeometricObject g1 = new Circle(5.5);
        System.out.println(g1);
        System.out.println("Area of g1: " + g1.getArea());
        System.out.println("Perimeter of g1: " + g1.getPerimeter());

        // Tạo đối tượng Rectangle
        GeometricObject g2 = new Rectangle(4.0, 6.0);
        System.out.println(g2);
        System.out.println("Area of g2: " + g2.getArea());
        System.out.println("Perimeter of g2: " + g2.getPerimeter());


        Circle c1 = (Circle) g1;
        System.out.println(c1.getRadius());


        Rectangle r1 = (Rectangle) g2;
        System.out.println(r1.getWidth());
        System.out.println(r1.getLength());

        GeometricObject[] gObjects = new GeometricObject[2];
        gObjects[0] = g1;
        gObjects[1] = g2;


        for (GeometricObject g : gObjects) {
            System.out.println(g);
            System.out.println("Area: " + g.getArea());
            System.out.println("Perimeter: " + g.getPerimeter());
        }
    }
}