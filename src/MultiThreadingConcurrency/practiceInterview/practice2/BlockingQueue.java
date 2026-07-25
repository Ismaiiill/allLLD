package src.MultiThreadingConcurrency.practiceInterview.practice2;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    private Queue<Integer> q;
    private int capacity;
    private Object lock;

    public BlockingQueue(int capacity){
        this.q=new LinkedList<>();
        this.capacity=capacity;
        this.lock=new Object();
    }

    public boolean add(int num) throws InterruptedException{
        synchronized (lock){
            while (q.size()>=this.capacity){
                System.out.println(" waiting for item to be removed ");
                lock.wait();
            }

            q.add(num);
            lock.notifyAll();
            return true;
        }


    }
    public int remove() throws InterruptedException{
        synchronized (lock){
            while (q.size()<=0){
                System.out.println(" waiting for item to be added ");
                lock.wait();
            }
            int obj= q.remove();
            lock.notifyAll();
            return obj;
        }

    }

}
