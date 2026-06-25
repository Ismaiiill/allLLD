package src.MultiThreadingConcurrency.concurrency.ExecutorSercvice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/*
    - way of creating multiple thread
    - how to create multiple thread
    - provide pool of threads
    - 4 types of executorService
      - SingleThreadExecutorService
      - FixedThreadPoolExecutor
      - cachedThreadPool
      - ScheduledExecutor

    ExecutorService has 2 things,threadPool where all pre created threads are stored
    and Blocking Queue, where all the task are being stored
     */

public class ExecutorServiceImpl {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(()->{
            System.out.println("running");
        });
    }


}
