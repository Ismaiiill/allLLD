package src.MultiThreadingConcurrency.multithreading;

public class Main {
    public static void main(String[] args) throws Exception {
        Runna t1=new Runna();
        Calla c1=new Calla();
        Threads t2=new Threads();
        Threads t3=new Threads();
//        t1.run();
        t2.start();
        t3.start();

        Object o1=c1.call();
//        System.out.println(o1);

    }


}
