package src.MultiThreadingConcurrency.Threads;

import javax.swing.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class DaemonThread {
    public static void main(String[] args) {
        Thread bgThread=new Thread(new DaemonHelper());
        Thread userHelper=new Thread(new UserHelperThread());

        bgThread.setDaemon(true);
        bgThread.setPriority(10);
        bgThread.start();
        Thread.currentThread().setPriority(10);
        userHelper.start();
    }
}

class DaemonHelper implements Runnable{

    @Override
    public void run() {
        int count=0;
        while (count<500){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println("Daemon helper running");
        }

    }
}
class UserHelperThread implements Runnable{

    @Override
    public void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("User thread done with execution");

    }
}