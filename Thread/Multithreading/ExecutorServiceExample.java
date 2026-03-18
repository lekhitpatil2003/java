import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

class MyTask implements Runnable {
    public void run() {
        System.out.println("Task executed by thread : " + Thread.currentThread().getName());
    }
}

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService service = new ExecutorService() {
            service.execute(new MyTask());
            service.execute(new MyTask());
            service.execute(new MyTask());
            service.execute(new MyTask());
            service.execute(new MyTask());
            service.execute(new MyTask());
            service.shoutdown();
        };
        
    }
}
