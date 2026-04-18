package src.MultiThreadingConcurrency.concurrency.BlockingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
    Queue<Integer> q;
    private final int capacity;

    public BlockingQueue(int cap) {
        q = new LinkedList<>();
        this.capacity = cap;
    }

    public boolean add(int ele) throws InterruptedException {
        synchronized (q) {
            while (q.size() == capacity) {
                q.wait();
            }
            q.add(ele);
            q.notifyAll();
            return true;
        }
    }

    public int remove() throws InterruptedException {
        synchronized (q) {
            while (q.isEmpty()) {
                q.wait();
            }
            int ele = q.poll();
            q.notifyAll();
            return ele;
        }
    }
}
