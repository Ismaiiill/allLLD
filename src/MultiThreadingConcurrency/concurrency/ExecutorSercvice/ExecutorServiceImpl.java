package src.MultiThreadingConcurrency.concurrency.ExecutorSercvice;

import java.util.concurrent.*;

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
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(()->{
            System.out.println( 100);
        });

        executorService.execute(()->{
            System.out.println("Task");
        });

        Future<Integer> ft=executorService.submit(()->100);
        ft.get();
        ft.cancel(false);
        ft.isDone();
        ft.isCancelled();

        executorService.shutdown();
        */
//        ExecutorService service=new ThreadPoolExecutor(5,10,10L,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(5));
        ExecutorService service= Executors.newCachedThreadPool();
        for (int i=0;i<100;i++){
            service.execute(()-> System.out.println(Thread.currentThread().getName()));
        }


        /*
        # execute and submit
         execute takes runnable and submit takes callable and return a future remember that
        */



    }


}
