package src.MultiThreadingConcurrency.practiceInterview.practice2;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        /*
        Stack stack=new Stack(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        Thread t1=new Thread(()->{
            for (int i=1;i<=1011;i++){
                try {
                    System.out.println(stack.push(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2=new Thread(()->{
            for (int i=1;i<=1010;i++){
                try {
                    System.out.println(stack.pop());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        */
        BlockingQueue queue=new BlockingQueue(5);
        Thread t1=new Thread(()->{
            for (int i=1;i<=1011;i++){
                try {
                    System.out.println(queue.add(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2=new Thread(()->{
            for (int i=1;i<=1010;i++){
                try {
                    System.out.println(queue.remove());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();


    }
}
