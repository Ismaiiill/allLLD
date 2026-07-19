package src.MultiThreadingConcurrency.multithreading;

import src.MultiThreadingConcurrency.concurrency.ConcurrentCollection.BlockingQueue.BlockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorService1 {
//    ExecutorService service=new ThreadPoolExecutor();
    BlockingQueue<> queue=new BlockingQueue(10);
    ThreadPoolExecutor t1=new ThreadPoolExecutor(10,10,4L, TimeUnit.DAYS,queue);
}
