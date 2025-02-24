package ex6_6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        Dog dog1 = new Dog("Tommy");
        Dog dog2 = new BigDog("Spike");

        cat.greets(); // In ra "Meow"
        dog1.greets(); // In ra "Woof"
        dog2.greets(); // In ra "Wooow"

        dog1.greets(dog2); // In ra "Woooof"
        dog2.greets(dog1); // In ra "Woooooow"
        dog2.greets((BigDog) dog2); // Ép kiểu dog2 về BigDog và in ra "Wooooooooow"
    }
}
