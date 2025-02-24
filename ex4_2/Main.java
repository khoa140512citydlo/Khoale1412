package ex4_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123 Main St");
        System.out.println(person); // In ra: Person[name=John Doe,address=123 Main St]

        Student student = new Student("Jane Smith", "456 Elm St", "Computer Science", 2023, 1000.0);
        System.out.println(student); // In ra: Student[Person[name=Jane Smith,address=456 Elm St],program=Computer Science,year=2023,fee=1000.0]

        Staff staff = new Staff("Alice Johnson", "789 Oak St", "Harvard University", 50000.0);
        System.out.println(staff); // In ra: Staff[Person[name=Alice Johnson,address=789 Oak St],school=Harvard University,pay=50000.0]
    }
}