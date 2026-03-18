class Mythread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 100; i++) {
                System.out.println("Thread Running : " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class SleepThreadExample {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();
    }
}