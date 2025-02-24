package ex3_4;

public class Test {
    public static void main(String[] args) {
        MyTime time = new MyTime(14, 1, 9);
        System.out.println("Thời gian hiện tại: " + time);

        time.nextSecond();
        System.out.println("Thời gian sau 1 giây: " + time);

        time.nextMinute();
        System.out.println("Thời gian sau 1 phút: " + time);

        time.nextHour();
        System.out.println("Thời gian sau 1 giờ: " + time);

        time.previousSecond();
        System.out.println("Thời gian trước 1 giây: " + time);

        time.previousMinute();
        System.out.println("Thời gian trước 1 phút: " + time);

        time.previousHour();
        System.out.println("Thời gian trước 1 giờ: " + time);
    }
}