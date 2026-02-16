class while_example {
    public static void main(String[] args) {
        // int num = 1;
        // while (num <= 10) {
        //     System.out.println(num);
        //     num++;
        // }

        //syntax of while loop
        //while(condition){ 
        //    //code to be executed
        //}

        int number = 5; // Example number to find factorial
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        System.out.println(factorial);

    }
}