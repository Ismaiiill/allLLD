package src.MultiThreadingConcurrency.concurrency.Practice;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WaitandNotify waitandNotify=new WaitandNotify(5);
        Thread thread1=new Thread(
                ()->{
                    int counter=0;
                    while(++counter<10) {
                        try {
                            System.out.println("Pushed"+ waitandNotify.addd(100));
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        thread1.start();

        Thread thread2=new Thread(
                ()->{
                    int counter=0;
                    while(++counter<10) {
                        try {
                            System.out.println("Popped"+ waitandNotify.remove());
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );

        thread2.start();
    }
}
