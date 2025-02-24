package ex3_7;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
        return distance < 8;
    }

    public void kick(Ball ball) {
        // Giả sử lực đá làm quả bóng di chuyển theo hướng của người chơi
        ball.setXYZ(this.x + (ball.getX() - this.x) * 2, this.y + (ball.getY() - this.y) * 2, ball.getZ() + 1);
    }
}