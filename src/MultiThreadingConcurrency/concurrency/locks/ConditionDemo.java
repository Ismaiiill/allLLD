package src.MultiThreadingConcurrency.concurrency.locks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo {
    private final Integer MAX_SIZE=5;
    private final Lock lock1= new ReentrantLock();
    private final Lock lock2= new ReentrantLock();
    private final Queue<Integer> buffer=new LinkedList<>();
    private final Condition bufferNotFull= lock1.newCondition();
    private final Condition bufferNotEmpty= lock1.newCondition();



}
