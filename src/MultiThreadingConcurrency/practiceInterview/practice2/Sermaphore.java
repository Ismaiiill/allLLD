package src.MultiThreadingConcurrency.practiceInterview.practice2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Sermaphore {
    static Semaphore semaphore=new Semaphore(3);
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(10);

        for (int i=0;i<20;i++){
            int id=i;
            service.submit(()->{
                try {
                    semaphore.acquire();
                    System.out.println(
                            "Thread "
                                    +id+
                                    " entered by "
                                    +Thread.currentThread().getName());
                    Thread.sleep(500);
                }catch (Exception ex){

                }finally {
                    semaphore.release();
                }

            });
        }

        service.shutdown();
    }

}
