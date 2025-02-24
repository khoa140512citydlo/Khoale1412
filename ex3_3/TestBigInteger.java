package ex3_3;

import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Khởi tạo hai số BigInteger từ chuỗi
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Tính tổng và in kết quả
        BigInteger sum = i1.add(i2);
        System.out.println("Tổng của i1 và i2 là: " + sum);

        // Tính tích và in kết quả
        BigInteger product = i1.multiply(i2);
        System.out.println("Tích của i1 và i2 là: " + product);
    }
}