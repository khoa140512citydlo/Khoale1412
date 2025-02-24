package ex2_7;

import ex2_6.MyPoint;

public class MyLineTest {
    public static void main(String[] args) {
        // Test constructor and toString()
        MyLine line1 = new MyLine(1, 2, 5, 6);
        System.out.println("Line 1: " + line1);

        MyPoint p1 = new MyPoint(2, 3);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println("Line 2: " + line2);

        System.out.println("Begin X of line 1: " + line1.getBeginX()); // Output: 1
        line1.setBeginX(3);
        System.out.println("Updated line 1: " + line1);

        System.out.println("Length of line 1: " + line1.getLength());
        System.out.println("Gradient of line 1: " + line1.getGradient());

        int[] beginXY = line1.getBeginXY();
        System.out.println("Begin XY of line 1: (" + beginXY[0] + ", " + beginXY[1] + ")");

        line1.setEndXY(9, 10);
        System.out.println("Updated line 1: " + line1);
    }
}