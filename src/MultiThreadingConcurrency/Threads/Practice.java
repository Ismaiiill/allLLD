package src.MultiThreadingConcurrency.Threads;

public class Practice {
    public static void main(String[] args) {
        Thread t1=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread class is running " + i +" " +Thread.currentThread().getName());
            }

        });
        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread class is running " + i + " "+Thread.currentThread().getName());
            }

        });
        Runnable t3=()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable class is running " + i +" "+ Thread.currentThread().getName());
            }

        };

        t1.start();
        t2.start();
        t3.run(); //occupy all the jvm after getting the jvm time and finish its job using main thread

    }
}

