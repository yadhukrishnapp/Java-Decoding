class Stud{
    int Rno = 5;
    String name;

    void init(int Rno, String name){
        this.Rno = Rno;
        this.name = name;
    }

    void display(){
        System.out.println(Rno + name);
    }
}

public class New1Class {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.init(15, "ABC");
        s1.display();
    }
}
