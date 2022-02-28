class NumCount{
    static int num = 0;

    NumCount(){
        num++;
        System.out.println(num);
    }

    static void display(){
        System.out.println("Access to method");
    }
}

public class NewDemo2 {
    public static void main(String[] args) {

    NumCount.display();

    NumCount n1 = new NumCount();
    NumCount n2 = new NumCount();
    NumCount n3 = new NumCount();
        
    }
}
