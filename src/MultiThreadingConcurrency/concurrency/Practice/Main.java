package src.MultiThreadingConcurrency.concurrency.Practice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    /*
        Stack stack=new Stack(5);
        Thread thread1=new Thread(
                ()->{
                    int counter=0;
                    while(++counter<10) {
                        System.out.println("Pushed"+ stack.push(100));
                    }
                }
        );
        thread1.start();

        Thread thread2=new Thread(
                ()->{
                    int counter=0;
                    while(++counter<10) {
                        System.out.println("Popped"+ stack.pop());
                    }
                }
        );

        thread2.start();

     */
        ProducerAndConsumer producerAndConsumer=new ProducerAndConsumer(5,0);
        Thread produce=new Thread(()->{
            try {
                producerAndConsumer.produce();
            }catch (InterruptedException e){
                throw new RuntimeException();
            }

        });

        Thread consumer=new Thread(()->{
            try {
                producerAndConsumer.consumer();
            }catch (InterruptedException e){
                throw new RuntimeException();
            }
        });

        produce.start();
        consumer.start();
    }
}
