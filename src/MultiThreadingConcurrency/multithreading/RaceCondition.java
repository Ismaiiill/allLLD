package src.MultiThreadingConcurrency.multithreading;

import java.util.concurrent.atomic.AtomicInteger;
public class RaceCondition {
    private static  int ans=0;
    private static AtomicInteger integer=new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException{

        Thread t1=new Thread(()->{
            for(int i=0;i<10000;i++){
                ans=ans+1;
                integer.addAndGet(1);

            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<10000;i++){
                ans++;
                integer.addAndGet(1);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(ans);
        System.out.println(integer.get());
    }
}
