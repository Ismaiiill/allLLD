package src.MultiThreadingConcurrency.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadSynchronization {
    private static int counter=0;
    private static Object obj=new Object();
    public static void main(String[] args) {

        Thread t1=new Thread(()->{
            for(int i=0;i<20000;i++) {
                synchronized (obj){
                    counter++;
                }

            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<20000;i++) {
                synchronized (obj){
                    counter++;
                }
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

