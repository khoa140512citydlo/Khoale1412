package ex2_9;

import ex2_6.MyPoint;

public class Main {
    public static void main(String[] args) {
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        MyTriangle t2 = new MyTriangle(new MyPoint(1, 1), new MyPoint(4, 1), new MyPoint(2, 3));

        System.out.println("t1: " + t1); // In ra: MyTriangle[v1=(0, 0), v2=(3, 0), v3=(0, 4)]
        System.out.println("t2: " + t2); // In ra: MyTriangle[v1=(1, 1), v2=(4, 1), v3=(2, 3)]

        System.out.println("Perimeter of t1: " + t1.getPerimeter()); // In ra chu vi của t1
        System.out.println("Type of t2: " + t2.getType()); // In ra loại tam giác của t2
    }
}
