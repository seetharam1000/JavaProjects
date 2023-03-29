package c6_threads;

public class SleepThread {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread sleep method ==>  "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Exception handled " + e.getMessage());
                    }
                }

                System.out.println("Thread went to dead state");
            }
        };
        t.start();
    }
}
