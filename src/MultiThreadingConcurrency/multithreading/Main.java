package src.MultiThreadingConcurrency.multithreading;

public class Main {
    public static void main(String[] args) throws Exception {
        Runna t1=new Runna();
        Calla c1=new Calla();
        Threads t2=new Threads();
        Threads t3=new Threads();
        Thread t4=new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println("functional interface "+i);
            }
        });
//        t1.run();
        t2.start();
        t3.start();
        t4.start();
        t3.wait();
        t3.notify();
        t3.notifyAll();
        Thread.yield();
        t3.interrupt();
        Thread.interrupted();
        t3.isAlive();
        Thread.currentThread().getName();
        t3.setName("heu");
        t3.setPriority(10);

        Object o1=c1.call();
//        System.out.println(o1);
//        new, runnable, running, waiting, timedwaiting, terminated
    }


}
