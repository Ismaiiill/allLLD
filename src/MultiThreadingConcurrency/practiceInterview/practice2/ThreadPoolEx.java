package src.MultiThreadingConcurrency.practiceInterview.practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(5);
        List<Future<String>> futureList= new ArrayList<>();

        for (int i=0;i<1000;i++){
            Future<String> st=service.submit(()->{
                return "Thread is working ";
            });
            futureList.add(st);
        }
        for (int i=0;i<futureList.size();i++){
            System.out.println(futureList.get(i).get());
        }

        service.shutdown();


    }



}
