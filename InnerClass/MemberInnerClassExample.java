package InnerClass;

class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of X : " + x);
        }
    }
}

public class MemberInnerClassExample {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner inner = obj.new Inner();

        inner.display();
    }
}
