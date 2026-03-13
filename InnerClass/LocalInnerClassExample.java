package InnerClass;

class Outer {
    void display(){
        class Inner {
            void message(){
                System.out.println("Welcome to FCT");
            }
        }
        Inner obj = new Inner();
        obj.message();
    }
}
public class LocalInnerClassExample {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}
