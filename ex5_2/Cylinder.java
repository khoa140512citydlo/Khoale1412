package ex5_2;

public class Cylinder {
    private Circle base; // Composition: Cylinder chứa một Circle
    private double height;

    public Cylinder() {
        this.base = new Circle(); // Khởi tạo Circle
        this.height = 1.0;
    }

    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color); // Khởi tạo Circle với tham số
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }


    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ", height=" + height + "]";
    }
}