// class MyThread1 extends Thread {
//     public void run()
//     {
//         try {
//             System.out.println("Thread " + Thread.currentThread().getId() + " is running");
//         }
//         catch (Exception e) {
//             System.out.println("Exception is caught");
//         }
//     }
// }

class MyThread2 extends Thread {
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // MyThread1 object1 = new MyThread1();
        // object1.start();
        int i = 0;
        while(i<5) {
            MyThread2 object2 = new MyThread2();
            object2.start();
            i++;
        }
    }
}