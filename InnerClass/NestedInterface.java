package InnerClass;

class Outer {
    interface Message {
        void display();
    }
}

class Demo implements Outer.Message{
    public void display(){
        System.out.println("Nested Interface Example.");
    }
}

public class NestedInterface {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.display();
    }
}
