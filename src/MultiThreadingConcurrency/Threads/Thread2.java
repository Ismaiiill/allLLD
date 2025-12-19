package src.MultiThreadingConcurrency.Threads;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<4;i++){
            System.out.println("you are inside "+ Thread.currentThread().getName()+" "+ i);
        }
    }
}
