package ex6_4;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 10, 5);
        System.out.println(point);

        point.moveUp();
        System.out.println(point);

        point.moveRight();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 10, 5, 5);
        System.out.println(circle);

        circle.moveUp();
        System.out.println(circle);

        circle.moveLeft();
        System.out.println(circle);
    }
}
