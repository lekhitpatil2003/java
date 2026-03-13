package InnerClass;

class Outer {
    static int data = 50;

    static class Inner {
        void display() {
            System.out.println(data);
        }
    }
}

public class StaticNestedExample {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}
