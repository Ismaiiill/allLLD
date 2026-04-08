package src.MultiThreadingConcurrency.concurrency.Practice;

public class Stack {
    private int[] array;
    private int stackTop;

    public Stack(int capacity){
        this.array=new int[capacity];
        stackTop=-1;
    }
    public  boolean push(int element){
        if(isFull()) return false;
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        array[stackTop]=element;
        stackTop++;
        return true;
    }

    public int pop(){
        if (isEmpty()) return Integer.MIN_VALUE;
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(e);
        }
        int ele=array[stackTop];
        stackTop--;
        return ele;

    }
    public boolean isEmpty(){
        return stackTop<0;
    }
    public boolean isFull(){
        return stackTop >= array.length-1;
    }
}
