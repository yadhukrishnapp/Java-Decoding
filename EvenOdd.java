public class EvenOdd {
    // Starting counter
    int counter = 1;
    static int N;

    // Function to print odd numbers
    public void printOddNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is even then print
                while (counter % 2 == 0) {
                    // Exception handle
                    try {
                        System.out.println("\nt1 waits");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print("\nt1 prints" + counter + " ");
                // Increment counter
                counter++;
                // Notify to second thread
                System.out.println("\nt1 Notifies");
                notify();
            }
        }
    }

    // Function to print even numbers
    public void printEvenNumber() {
        synchronized (this) {
            // Print number till the N
            while (counter < N) {
                // If count is odd then print
                while (counter % 2 == 1) {
                    // Exception handle
                    try {
                        System.out.println("\nt2 waits");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Print the number
                System.out.print("\nt2 prints" + counter + " ");
                // Increment counter
                counter++;
                // Notify to 2nd thread
                System.out.println("\nt2 Notifies");
                notify();
            }
        }
    }

    // Driver Code
    public static void main(String[] args) {
        // Given Number N
        N = 10;
        // Create an object of class
        EvenOdd mt = new EvenOdd();
        // Create thread t1
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });
        // Create thread t2
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });
        // Start both threads
        t1.start();
        t2.start();
    }
}