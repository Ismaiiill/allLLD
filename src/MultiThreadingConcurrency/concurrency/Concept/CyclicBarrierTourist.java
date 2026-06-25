package src.MultiThreadingConcurrency.concurrency.Concept;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTourist {
    private static final int TOURISTs=5;
    private static final int TOURIST_STAGE=3;
    private static final CyclicBarrier barrier=new CyclicBarrier(TOURISTs,()->{
        System.out.println("Tour guide starts speaking");
    });

    public static void main(String[] args) {
        for (int i=0;i<TOURISTs;i++){
            Thread touristThread=new Thread(new Tourist(i));
            touristThread.start();
        }

    }

    static class Tourist implements Runnable{
        private final int touristId;
        public Tourist(int touristId){
            this.touristId=touristId;
        }
        @Override
        public void run() {
            for (int i=0;i<TOURIST_STAGE;i++){
//                try {
//                    Thread.sleep(10);
//                }catch (InterruptedException e){
//                    throw new RuntimeException(e);
//                }

                System.out.println("Tourist "+touristId+" arrives at stage "+(i+1));

                try {
                    barrier.await();
                } catch (BrokenBarrierException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
