package src.MultiThreadingConcurrency.Threads;

public class Main {
    public static void main(String[] args){
        Object lock;
        lock=new Object();
        System.out.println("main is starting ");
//        Thread1 thread1=new Thread1("Thread1");
//        thread1.start();
//        thread1.run();
        Runnable thread2=new Thread2();
        Thread thread3=new Thread(new Thread2());
        thread3.run();
        thread3.start();
        System.out.println("main is ending ");
//        t1,t2,t3
        synchronized (new String("dfdfsf")){
            System.out.println("lsdfs");
        }

    }
}
