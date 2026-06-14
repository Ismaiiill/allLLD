package src.MultiThreadingConcurrency.concurrency.Practice;


import java.util.LinkedList;
import java.util.Queue;

public class WaitandNotify  {
    private  final Integer SIZE;
    private   Queue queue;

    public WaitandNotify(int size) throws InterruptedException {
        this.SIZE=size;
        this.queue=new LinkedList();
    }

    public boolean addd(Integer element) throws InterruptedException{
        synchronized (queue){
            while (queue.size()==SIZE){
                System.out.println("can't add right now, queue if full");
                queue.wait();
            }
            queue.add(element);
            queue.notifyAll();
            return true;
        }

    }

    public boolean remove() throws InterruptedException{
        synchronized (queue) {
            if (queue.size() == 0) {
                System.out.println("can't remove right now, queue if empty");
                queue.wait();
            }
            queue.poll();
            queue.notifyAll();
            return true;
        }
    }



}
