// public class Demo {
//     public static void main(String[] args) {
//         double num = Math.sqrt(16);
//         System.out.println("Square root of 16 is: " + num);
//     }
// }

//Method with no return Type
// public class Demo {
//     public void name () {
//         System.out.println("Yogesh Nana");
//     }
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         obj.name();
//     }
// }

//Method with return Type
// public class Demo {
//     public String name () {  
//         return "Yogesh Nana";
//     }
//     public static void main(String[] args) {
//         Demo obj = new Demo();
//         String name = obj.name();
//         System.out.println(name);
//     }
// }

//method with parameter
public class Demo {
    public int Add (int num1, int num2) {  
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Demo obj = new Demo();
        int Result = obj.Add(5, 4);
        System.out.println(Result);
        
        Demo obj1 = new Demo();
        int Result1 = obj1.Add(8, 4);
        System.out.println(Result1);

        System.out.println(obj == obj1); // false, because they are different objects in memory
        System.out.println(obj.equals(obj1)); // false, because equals() is not overridden and defaults to reference equality
    }
}

//method with no parameter