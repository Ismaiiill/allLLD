package src.MultiThreadingConcurrency.Threads;

public class Thread1 extends Thread{
    @Override
    public void run(){
        for (int i=0;i<6;i++){
            System.out.println(i+" "+currentThread().getName());
        }
    }
}
