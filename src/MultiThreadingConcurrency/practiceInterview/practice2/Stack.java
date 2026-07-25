package src.MultiThreadingConcurrency.practiceInterview.practice2;

public class Stack {
    private int stackTop;
    private int[] arr;
    private Object lock=new Object();

    public Stack(int size ){
        this.arr=new int[size];
        stackTop=-1;
    }

    public boolean isEmpty(){
        return stackTop<0;
    }

    public boolean isFull(){
        return stackTop>=arr.length -1;
    }

    public boolean push(int element) throws InterruptedException{

        synchronized (lock) {
            System.out.print(element+" pushing");
            if (isFull()) {
                System.out.println("no space avaliable ");
                lock.wait();
            }
            try {
//                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException("sldfjlsdf");
            }
            this.stackTop++;
            this.arr[stackTop] = element;
            lock.notifyAll();
            return true;
        }


    }
    public int pop() throws InterruptedException {
        synchronized (lock) {
            System.out.print("poping ");
            if (isEmpty()) {
                System.out.println("full right now ");
                lock.wait();
            }
            try {
//                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException("sldfjlsdf");
            }
            int obj = arr[stackTop];
            arr[stackTop] = Integer.MIN_VALUE;
            stackTop--;
            lock.notifyAll();
            return obj;

        }
    }

}
/**
 * runnable has run method, doesn't have start
 * thread has start method
 * java supports only single inheritance, can't extend multiple class
 * Runnable only represents the class
 *
 */
