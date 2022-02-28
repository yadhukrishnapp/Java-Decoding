// public class MyClass {
//     int Rno;
//     String name;

//     public static void main(String[] args ){
//         MyClass s1 = new MyClass();
//         s1.Rno = 15;
//         s1.name = "ABC";
//         System.out.println(s1.Rno +);
//     }
// }


class Stud {
    int Rno;
    String name;


    void init(int r, String n){
    Rno = r;
    name = n;
}

    void Display(){
    System.out.println(Rno + name);
}

public class MyClass {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.init(15, "ABC");
        s1.Display();
    }
}