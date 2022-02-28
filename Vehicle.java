//Creating a parent class.  
class Automobile {
    // defining a method
    void run() {
        System.out.println("Vehicle is running");
    }
}

// Creating a child class
class Bike2 extends Automobile {
    // defining the same method as in the parent class
    void run() {
        System.out.println("Bike is running safely");
    }

    public class Vehicle {
        public static void main(String[] args) {
            Bike2 obj = new Bike2();// creating object
            obj.run();// calling method
        }
    }
}