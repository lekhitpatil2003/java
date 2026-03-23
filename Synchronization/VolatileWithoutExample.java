package Synchronization;

class ShareData {
    boolean flag = false;
}

public class VolatileWithoutExample {
    public static void main(String[] args) {
        ShareData data = new ShareData();
        Thread writer = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.flag = true;
            System.out.println("Writer thread changed flag to true");
        });
        Thread reader = new Thread(() -> {
            while(!data.flag) {
                //waiting
            }
            System.out.println("Reader thread saw flag = true");
        });
    }
}

//Problem here : Sometimes reader thread may see the change madeby writer thread and may run indefinitely. this is because without volatile, there is no guarantee that the reader thread will see the updated value of flag.