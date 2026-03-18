package Join;

class Task extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
        System.out.println(Thread.currentThread().getName() + " Finished");
    }
}

public class MultiJoinExample {
    public static void main(String[] args) throws Exception {
        Thread th1 = new Thread("FCT1");
        Task t1 = new Task();
        Task t2 = new Task();
        t1.start();
        t1.join(); 
        t2.start();
        t2.join();
        System.out.println("Main COmpleted.");
    }
}
