package ex3_6;

public class Test {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);

        for (int step = 0; step < 100; ++step) {
            ball.move();

            if (box.collides(ball)) {
                System.out.println("Quả bóng va chạm với container!");
                break; // Thoát khỏi vòng lặp nếu có va chạm
            }

            System.out.println(ball); // In ra vị trí của quả bóng sau mỗi bước di chuyển
        }
    }
}