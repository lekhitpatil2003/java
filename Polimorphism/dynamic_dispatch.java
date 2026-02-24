package Polimorphism;

//base class or Parent class
class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }

    public void name(){
        System.out.println("My name is java from base class...");
    }
}
//Derived Class
class Smartphone extends Phone{
    public void swagat(){
        System.out.println("Shubh Prabhat...");
    }

    @Override
    public void name(){
        System.out.println("My name is java from derived class...");
    }
}

public class dynamic_dispatch {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.greet();
        //obj.swagat(); // This will give an error because the reference type is Phone which does not have swagat() method
        obj.name();

        Smartphone obj2 = new Smartphone();
        obj2.greet(); // This will work because Smartphone inherits from Phone
        obj2.swagat(); // This will work because the reference type is Smartphone which has swagat() method
        obj2.name(); // This will call the name() method of Smartphone class because of method overriding

        Phone obj3 = new Smartphone(); // Upcasting
        obj3.greet(); // This will work because Phone class has greet() method
        obj3.name(); // This will call the name() method of Smartphone class because of dynamic dispatch
        //obj3.swagat(); // This will give an error because the reference type is Phone which does not have swagat() method
        
        //Downcasting
        Smartphone obj4 = (Smartphone) obj3; // Downcasting
        obj4.swagat(); // This will work because the reference type is Smartphone which has swagat() method

        //Another way of downcasting without creating a new reference variable
        ((Smartphone)obj3).swagat(); // This will also work because we are downcasting the reference type to Smartphone which has swagat() method
    }
}
