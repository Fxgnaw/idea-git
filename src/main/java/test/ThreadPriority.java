package test;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-------------" + i);
        }
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        t1.setName("t1");
        t1.setPriority(10);
        t2.setName("t2");
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
