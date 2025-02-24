package ex2_8;

import ex2_6.MyPoint;

public class TestMain {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle(0, 0, 5);
        MyCircle c2 = new MyCircle(new MyPoint(10, 10), 3);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        System.out.println("Area of c1: " + c1.getArea());
        System.out.println("Circumference of c2: " + c2.getCircumference());

        System.out.println("Distance between c1 and c2: " + c1.distance(c2));
    }
}
