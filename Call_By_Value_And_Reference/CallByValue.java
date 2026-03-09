package Call_By_Value_And_Reference;

public class CallByValue {
    public static void changeValue(int x) {
        x = 50;
        System.out.println("Printing X : " + x);        
    }
    public static void main(String[] args) {
        int num = 10;
        changeValue(num);
        System.out.println("Printing num : " + num);
    }
}
