package src.MultiThreadingConcurrency.Threads;

public class JoinThreadExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("Thread 1 : "+i);
            }
        });
        Thread t2=new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("Thread 2 : "+i);
            }
        });
        Thread t3=new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("Thread 3 : "+i);
            }
        });
        t1.start();
        t1.join(); //throws interrupted Exception  there can be timed join
        t2.start();

        System.out.println("done executing the threads");
    }
}
