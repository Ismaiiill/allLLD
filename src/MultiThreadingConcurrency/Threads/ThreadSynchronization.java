package src.MultiThreadingConcurrency.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSynchronization {
    private static AtomicInteger counter=new AtomicInteger(0);
    public static void main(String[] args) {

        Thread t1=new Thread(()->{
            for(int i=0;i<20000;i++) {
                counter.addAndGet(1);
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<20000;i++) {
                counter.addAndGet(1);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception e){
            throw new RuntimeException();
        }
        System.out.println(counter);


    }
}

