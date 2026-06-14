package src.MultiThreadingConcurrency.Threads;

import java.time.LocalDateTime;

public class CustomLockSynchronisation {
    private static Integer counter1=0;
    private static Integer counter2=0;
    private static final Object lock1=new Object();
    private static final Object lock2=new Object();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for (int i=0;i<56660;i++){
                increment1();
            }
        });

        Thread t2=new Thread(()->{
            for (int i=0;i<56660;i++){
                increment2();
            }
        });

        try{
            System.out.println(LocalDateTime.now());
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            throw new RuntimeException("something went wrong");
        }
        System.out.println(LocalDateTime.now());
        System.out.println(counter1+"  "+counter2);

    }
    private static void increment1(){
        synchronized (lock1){
            counter1++;
        }
    }

    private static void increment2(){
        synchronized (lock2){
            counter2++;
        }
    }
}
