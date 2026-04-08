package src.MultiThreadingConcurrency.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread is starting");
//        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();

        thread2.run();
        System.out.println("main thread is existing"+Thread.currentThread().getName());
    }
}
