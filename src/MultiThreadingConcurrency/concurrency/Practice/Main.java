package src.MultiThreadingConcurrency.concurrency.Practice;

public class Main {
    public static void main(String[] args) {

        Stack stack=new Stack(5);
        Thread thread1=new Thread(
                ()->{
                    int counter=0;
                    while(++counter<10)
                        System.out.println("Pushed"+ stack.push(100));
                }
        );
        thread1.start();

        Thread thread2=new Thread(
                ()->{
                    int counter=0;
                    while(++counter<10)
                        System.out.println("Popped"+ stack.pop());
                }
        );

        thread2.start();
    }
}
