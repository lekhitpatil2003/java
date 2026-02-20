package Polimorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Yogesh extends Animal {
@Override
    void sound() {
        System.out.println("\nYogesh barks and Sounds like a dog");
    }
}

class Test {
    public static void main(String[] args) {
        Yogesh d = new Yogesh();
        d.sound();

        Animal a = new Yogesh();
        a.sound();
    }
}
