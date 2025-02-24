package ex5_2;

public class Circle {
    private double radius;
    private String color;

    // Constructor mặc định
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor với tham số
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter cho radius
    public double getRadius() {
        return radius;
    }

    // Setter cho radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter cho color
    public String getColor() {
        return color;
    }

    // Setter cho color
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}