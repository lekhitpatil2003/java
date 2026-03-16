package ThreadSchedular;

class PriorityThread extends Thread {
    PriorityThread(String name, int priority) {
        super(name); //set thread name
        setPriority(priority); // set thread priority (1 to 10)
    }

    public void run(){
        System.out.println(getName() + " with priority " + getPriority() + " is Running. ");
    }

    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread 1", 3);
        PriorityThread t2 = new PriorityThread("Thread 2", 7);
        PriorityThread t3 = new PriorityThread("Thread 3", 5);
        PriorityThread t4 = new PriorityThread("Thread 4", 7);
        PriorityThread t5 = new PriorityThread("Thread 5", 2);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
