public class ThreadInterface implements Runnable {
    public void run() 
    {
        System.out.println("Thread is running..." + Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        ThreadInterface m1 = new ThreadInterface();
        Thread t1 = new Thread(m1);
        // This will call run() method
        int i = 0;
        t1.start();
        while(i < 5) {
            t1.run();
            i++;
        }
    }
}