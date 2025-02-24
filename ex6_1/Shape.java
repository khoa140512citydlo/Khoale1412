package ex6_1;

// Lớp trừu tượng Shape
abstract class Shape {
    protected String color;
    protected boolean filled;

    // Constructor mặc định
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    // Constructor có tham số
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter cho color
    public String getColor() {
        return color;
    }

    // Setter cho color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter cho filled
    public boolean isFilled() {
        return filled;
    }

    // Setter cho filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Phương thức trừu tượng tính diện tích
    public abstract double getArea();

    // Phương thức trừu tượng tính chu vi
    public abstract double getPerimeter();

    // Phương thức toString()
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}