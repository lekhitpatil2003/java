class Dog {
    // String name = "Tiger";
    String name;

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class Example {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Tiger";
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        Dog dog2 = new Dog();
        dog2.name = "Leo";
        dog2.eat();
        dog2.sleep();
        dog2.bark();
    }
}