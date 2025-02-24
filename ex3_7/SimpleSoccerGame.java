package ex3_7;

public class SimpleSoccerGame {
    public static void main(String[] args) {
        // Khởi tạo quả bóng
        Ball ball = new Ball(50, 50, 0);

        // Khởi tạo các cầu thủ
        Player player1 = new Player(1, 10, 10);
        Player player2 = new Player(2, 90, 90);

        // In vị trí ban đầu
        System.out.println("Vị trí ban đầu:");
        System.out.println("Bóng: " + ball);
        System.out.println("Cầu thủ 1: " + player1);
        System.out.println("Cầu thủ 2: " + player2);

        // Cầu thủ 1 di chuyển
        player1.move(5, 5);
        System.out.println("Cầu thủ 1 di chuyển:");
        System.out.println("Cầu thủ 1: " + player1);

        // Cầu thủ 1 đá bóng
        if (player1.near(ball)) {
            player1.kick(ball);
            System.out.println("Cầu thủ 1 đá bóng:");
            System.out.println("Bóng: " + ball);
        }

        // Cầu thủ 2 di chuyển và đá bóng
        player2.move(-10, -10);
        System.out.println("Cầu thủ 2 di chuyển:");
        System.out.println("Cầu thủ 2: " + player2);
        if (player2.near(ball)) {
            player2.kick(ball);
            System.out.println("Cầu thủ 2 đá bóng:");
            System.out.println("Bóng: " + ball);
        }
    }
}