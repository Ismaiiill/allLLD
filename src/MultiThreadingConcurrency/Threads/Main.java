package src.MultiThreadingConcurrency.Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("starting");
//        Thread.currentThread().wait(8);
        Thread1 thread1=new Thread1("thread1");
        Thread1 thread3=new Thread1("thread3");
        Thread2 thread2=new Thread2();
        Thread thread5=new Thread(thread2);
//        thread1.notifyAll();
        System.out.println(Thread.currentThread());
        Thread.sleep(5);
        thread1.start();
        thread3.run();
        System.out.println("ending");
        System.out.println("ending");
        System.out.println("ending");


    }
}
