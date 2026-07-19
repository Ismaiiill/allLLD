package src.MultiThreadingConcurrency.multithreading;

public class Threads extends Thread {

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("hey boi this is from extends "+i);
        }
    }

}
