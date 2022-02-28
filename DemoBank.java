abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 200;
    }
}

public class DemoBank {
    public static void main(String[] args) {
        Bank b;
        b = new BankA();
        System.out.println("The balance amount in BankA is : $"+b.getBalance());

        b = new BankB();
        System.out.println("The balance amount in BankB is : $"+b.getBalance());
        
        b = new BankC();
        System.out.println("The balance amount in BankC is : $"+b.getBalance());
    }
}
