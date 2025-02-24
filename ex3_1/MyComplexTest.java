package ex3_1;

public class MyComplexTest {
    public static void main(String[] args) {
        MyComplex a = new MyComplex(1.1, 2.2);
        MyComplex b = new MyComplex(3.3, 4.4);

        System.out.println("Số phức a: " + a);
        System.out.println("a có phải là số thực không? " + a.isReal());
        System.out.println("a có phải là số ảo không? " + a.isImaginary());

        System.out.println("Số phức b: " + b);
        System.out.println("b có phải là số thực không? " + b.isReal());
        System.out.println("b có phải là số ảo không? " + b.isImaginary());

        System.out.println("a có bằng b không? " + a.equals(b));

        System.out.println("Độ lớn của a: " + a.magnitude());

        System.out.println("a + b = " + a.addNew(b));

        System.out.println("a += b: " + a.addInto(b));
        System.out.println("a sau khi cộng: " + a);
    }
}