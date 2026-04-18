package src.MultiThreadingConcurrency.concurrency.Practice;


//ata pubsub category kore dissi
public class Stack {
    private int[] array;
    private int stackTop;
    Object lock;


    public Stack(int capacity){
        this.array=new int[capacity];
        stackTop=-1;
        lock=new Object();
    }

    //t1, t2, t3
    public  boolean push(int element){
        if(isFull()) {
            try{
//                Thread.wait();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        array[stackTop]=element;
        stackTop++;
//        Thread.notify();
        return true;
    }

    // t4, t5
    public int pop(){
        if (isEmpty()){
            try{
//                Thread.wait(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }

        int ele=array[stackTop];
        stackTop--;
//        Thread.notify();
        return ele;

    }
    public boolean isEmpty(){
        return stackTop<0;
    }
    public boolean isFull(){
        return stackTop >= array.length-1;
    }
}
