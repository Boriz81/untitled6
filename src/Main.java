import animal.Cat;
import animal.Dog;
import animal.Duck;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        dog.SayMethod();
        duck.SayMethod();
        cat.SayMethod();
    }
}