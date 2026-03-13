package InnerClass;

interface Greeting {
    void sayHello();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        Greeting obj = new Greeting() {
            public void sayHello(){
                System.out.println("Hello Lekhit ...");
            }
        };
        obj.sayHello();
    }
}