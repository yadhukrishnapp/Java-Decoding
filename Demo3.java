class NumCount{
    static int num = 0;

    NumCount(){
        num++;
        System.out.println(num);
    }
}



public class Demo3 {
    public static void main(String[] args) {
        NumCount n1 = new NumCount();
        NumCount n2 = new NumCount();
        NumCount n3 = new NumCount();
    }
}
