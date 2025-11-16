import zad1.Dog;

public static void main(String[] args) {
    Dog dog1 = new Dog();
    dog1.name = "Reksio";
    dog1.breed = "Beagle";
    dog1.age = 3;

    System.out.println("Przed wywołaniem bark():");
    dog1.bark();
    System.out.println("Po wywołaniu bark()");
}