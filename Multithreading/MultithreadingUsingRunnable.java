class myTask1 implements Runnable {
    public void run(){
        System.out.println("Thread using Runnable ..... ");
    }
}

public class MultithreadingUsingRunnable {
    public static void main(String[] args) {
        // step 1 : create runnable object
        myTask1 task = new myTask1();

        Thread t1 = new Thread(task, "FCT Thread");
        t1.start();
    }
}
