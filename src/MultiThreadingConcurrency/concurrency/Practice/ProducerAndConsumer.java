package src.MultiThreadingConcurrency.concurrency.Practice;


import java.util.ArrayList;
import java.util.List;

public class ProducerAndConsumer {
    private int sequence=0;
    private final Integer top;
    private final Integer bottom;
    private final List<Integer> container;
    public static final Object lock=new Object();

    public ProducerAndConsumer(Integer top, Integer bottom) {
        this.top = top;
        this.bottom = bottom;
        this.container = new ArrayList<>();
    }

    public void produce() throws InterruptedException{
        synchronized (lock){
            while (true) {
                if (container.size()==top){
                    System.out.println("Container is full, waiting for item to be removed");
                    lock.wait();
                }
                container.add(sequence);
                System.out.println(sequence+" is added to the container ");
                sequence++;
                lock.notifyAll();
//                Thread.sleep(500);
            }
        }
    }

    public void consumer() throws InterruptedException{
        synchronized (lock){
            while (true) {
                if (container.size()==bottom){
                    System.out.println("Container is empty, waiting for item to be added");
                    lock.wait();
                }
                container.removeLast();
                System.out.println(sequence+" is removed from the container ");
                sequence--;
                lock.notifyAll();
//                Thread.sleep(500);
            }
        }
    }


}
