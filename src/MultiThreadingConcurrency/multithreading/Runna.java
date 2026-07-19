package src.MultiThreadingConcurrency.multithreading;

public class Runna implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(" thread is running "+i);
        }
    }
}
