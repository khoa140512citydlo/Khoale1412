package ex4_6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        System.out.println(animal);

        Mammal mammal = new Mammal("Generic Mammal");
        System.out.println(mammal);

        Cat cat = new Cat("Garfield");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Fido");
        Dog dog2 = new Dog("Buddy");
        System.out.println(dog1);
        dog1.greets();
        dog1.greets(dog2);
    }
}