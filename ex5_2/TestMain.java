package ex5_2;

public class TestMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2.0, "blue", 3.0);
        System.out.println(cylinder);
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + cylinder.getVolume());
    }
}
