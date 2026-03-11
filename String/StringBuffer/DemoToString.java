package String.StringBuffer;

class Emp{
    int id;
    String name;

    public String toString(){
        return "Employee ID : " + id + " Name : " + name; 
    }
}

public class DemoToString {
    public static void main(String[] args) {
        Emp obj = new Emp();

        obj.id=1;
        obj.name="Lekhit";

        System.out.println(obj);
    }
}
