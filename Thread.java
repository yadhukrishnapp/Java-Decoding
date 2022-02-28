public class Thread extends Thread {
    public void run() {
        System.out.println("Task-1");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        t1.start();
        t2.start();
    }
}