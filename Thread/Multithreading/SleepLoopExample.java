public class SleepLoopExample {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(1000); // 1 Sec delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}