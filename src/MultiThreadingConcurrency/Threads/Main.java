package src.MultiThreadingConcurrency.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()-> {
            for (int i = 0; i < 6; i++) {
                System.out.println(i+" thread"+Thread.currentThread().getName());
            }
            ;
        });
        Runnable t2=()-> {
            for (int i = 0; i < 4; i++) {
                System.out.println(i+" Runnable"+Thread.currentThread().getName());
            }
        };
        t1.run();
        t2.run();

    }
}
