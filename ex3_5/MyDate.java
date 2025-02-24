package ex3_5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }


    public static boolean isValidDate(int year, int month, int day) {
        if (year < 0 || month < 1 || month > 12) {
            return false;
        }
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        return day >= 1 && day <= maxDay;
    }


    public static int getDayOfWeek(int year, int month, int day) {
        // Thuật toán Zeller's Congruence
        int m = (month + 9) % 12;
        int y = year - m / 10;
        return (y + y / 4 - y / 100 + y / 400 + 3 * m + day) % 7;
    }
    public MyDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Override
    public String toString() {
        String dayOfWeek = DAYS[getDayOfWeek(year, month, day)];
        String monthName = MONTHS[month - 1];
        return String.format("%s %d %s %d", dayOfWeek, day, monthName, year);
    }
    public MyDate nextDay() {
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        day++;
        if (day > maxDay) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        month++;
        if (month > 12) {
            month = 1;
            year++;
        }
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
    public MyDate previousDay() {
        day--;
        if (day == 0) {
            month--;
            if (month == 0) {
                month = 12;
                year--;
            }
            int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
            day = maxDay;
        }
        return this;
    }

    public MyDate previousMonth() {
        month--;
        if (month == 0) {
            month = 12;
            year--;
        }
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate previousYear() {
        year--;
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }
        return this;
    }
}