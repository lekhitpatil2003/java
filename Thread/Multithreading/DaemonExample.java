class MyThread extends Thread {
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread is running.");
        } else{
            System.out.println("User thread is running.");
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setDaemon(true); //making thread daemon
        t1.start();
        t2.start();
    }
}
