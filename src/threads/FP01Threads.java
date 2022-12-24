package threads;

import java.util.stream.IntStream;

public class FP01Threads {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0; i< 10000;i++){
//                    System.out.println(Thread.currentThread().getId() + ": "+i);
//                }
//            }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.start();
//
//        Thread thread2 = new Thread(runnable);
//        thread2.start();
//
//        Thread thread3 = new Thread(runnable);
//        thread3.start();

        Runnable runnable = () -> {
//                for(int i=0; i< 10000;i++){
//                    System.out.println(Thread.currentThread().getId() + ": "+i);
//                }
            IntStream.range(1,10000).forEach(num -> {
                System.out.println(Thread.currentThread().getId()+" : "+num);
            });
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.start();

    }
}
