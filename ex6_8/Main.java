package ex6_8;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        System.out.println(point); // In ra thông tin về điểm ban đầu

        point.moveUp();
        System.out.println(point); // In ra thông tin về điểm sau khi di chuyển lên trên

        MovableCircle circle = new MovableCircle();
        System.out.println(circle); // In ra thông tin về hình tròn ban đầu

        circle.moveLeft();
        System.out.println(circle); // In ra thông tin về hình tròn sau khi di chuyển sang trái
    }
}