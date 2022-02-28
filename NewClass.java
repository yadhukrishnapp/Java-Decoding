class Stud{
    public int Rno =5;
    String name;

    void disp() {
        System.out.println(Rno);
    }
}


public class NewClass {
    public static void main(String[] args) {
        
        Stud s1 = new Stud();
        s1.disp();
    }
}
