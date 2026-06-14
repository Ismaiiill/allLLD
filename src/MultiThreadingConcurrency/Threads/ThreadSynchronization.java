package src.MultiThreadingConcurrency.Threads;

public class ThreadSynchronization {
    private static int counter1=0;
    private static int counter2=0;
    private static Object obj=new Object();
    public static void main(String[] args) {

        Thread t1=new Thread(()->{
            for(int i=0;i<20000;i++) {
                increment1();

            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<20000;i++) {
                synchronized (obj){
                    increment2();
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
        System.out.println(counter1+ " === "+counter2);


    }

    private static synchronized void increment1(){
        counter1++;
    }
    private static synchronized void increment2(){
        counter2++;
    }
}

