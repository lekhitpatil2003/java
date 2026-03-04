package ARRAY;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[5]; // Declare an array of integers with size 5

        //Initialize the array with values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // int[] arr = new int[]{10, 20, 30, 40, 50}; // Declare and initialize the array in one line

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Alternatively, you can use an enhanced for loop to print the elements
        System.out.println("Elements of the array (using enhanced for loop):");
        for (int num : arr) {
            System.out.println(num);
            System.out.println(arr);
        }
    }
}
