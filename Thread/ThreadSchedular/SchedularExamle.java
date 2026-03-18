package ThreadSchedular;

class SchThread extends Thread {
    public void  run(){
        for(int i = 1; i <= 3; i++){
            System.out.println(Thread.currentThread().getName() + " running");
        }
    }
}
public class SchedularExamle {
    public static void main(String[] args) {
        SchThread st1 = new SchThread();
        SchThread st2 = new SchThread();
        st1.start();
        st2.start();
    }
}
