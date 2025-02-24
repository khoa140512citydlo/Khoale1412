package ex3_4;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    // Constructor mặc định
    public MyTime() {
    }

    // Constructor với tham số hour, minute, second
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Phương thức setTime() gán giá trị cho hour, minute, second
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Các getter cho hour, minute, second
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Các setter cho hour, minute, second
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // Phương thức toString() trả về chuỗi "HH:MM:SS"
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Các phương thức nextSecond(), nextMinute(), nextHour()
    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
            if (hour == 24) {
                hour = 0;
            }
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    // Các phương thức previousSecond(), previousMinute(), previousHour()
    public MyTime previousSecond() {
        second--;
        if (second == -1) {
            second = 59;
            minute--;
            if (minute == -1) {
                minute = 59;
                hour--;
                if (hour == -1) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute == -1) {
            minute = 59;
            hour--;
            if (hour == -1) {
                hour = 23;
            }
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour == -1) {
            hour = 23;
        }
        return this;
    }
}