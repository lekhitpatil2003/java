class FCTThread extends Thread{
    public void run(){
        System.out.println("FCT Thread is Running .......");
    }
}

public class MultithreadingUsingThreadClass {
    public static void main(String[] args) {
        
        // the following example shows how to create custom thread
        FCTThread t1 = new FCTThread();
        t1.start();

        Thread t2 = new Thread();
        t2.start();

        Thread t3 = new Thread("FCT Thread");
        System.out.println(t3.getName());
    }
}
