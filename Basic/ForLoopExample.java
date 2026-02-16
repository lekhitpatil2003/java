class ForLoopExample {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //print even number from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}