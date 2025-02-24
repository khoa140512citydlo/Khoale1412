package ex4_4;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(1.0f, 2.0f);
        System.out.println("Điểm ban đầu: " + point);

        point.setXY(3.0f, 4.0f);
        System.out.println("Điểm sau khi thay đổi tọa độ: " + point);

        float[] xy = point.getXY();
        System.out.println("Tọa độ x: " + xy[0]);
        System.out.println("Tọa độ y: " + xy[1]);

        MovablePoint movablePoint = new MovablePoint(5.0f, 6.0f, 7.0f, 8.0f);
        System.out.println("Điểm di chuyển ban đầu: " + movablePoint);

        movablePoint.move();
        System.out.println("Điểm di chuyển sau khi di chuyển: " + movablePoint);

        movablePoint.setSpeed(9.0f, 10.0f);
        System.out.println("Điểm di chuyển sau khi thay đổi tốc độ: " + movablePoint);

        float[] speed = movablePoint.getSpeed();
        System.out.println("Tốc độ x: " + speed[0]);
        System.out.println("Tốc độ y: " + speed[1]);
    }
}