package ex3_6;


public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor
    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    // Getters
    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1 + 1;
    }

    public int getHeight() {
        return y2 - y1 + 1;
    }

    // Kiểm tra xem quả bóng có va chạm với container hay không
    public boolean collides(Ball ball) {
        float ballX = ball.getX();
        float ballY = ball.getY();
        int ballRadius = ball.getRadius();

        // Kiểm tra va chạm theo từng cạnh của container
        if (ballX + ballRadius > x2) {
            return true;
        }
        if (ballX - ballRadius < x1) {
            return true;
        }
        if (ballY + ballRadius > y2) {
            return true;
        }
        if (ballY - ballRadius < y1) {
            return true;
        }

        return false;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "Container [(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}