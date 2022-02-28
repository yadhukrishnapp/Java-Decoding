import java.util.Scanner;

public class Testing
{
  String name;
  int age;
  Testing(String n,int a)
  { name=n; age=a; }
  void show()
  {
     System.out.println("Player name: "+name);
     System.out.println("Age: "+age);
  }
}
class cricket_player extends Testing
{
  String type;
  cricket_player(String n,String t,int a)
  {
     super(n,a);
     type=t;
  }
  public void show()
  {
     super.show();
     System.out.println("Player type : "+type);
  }
}
class football_player extends Testing
  {
     String type;
     football_player(String n,String t,int a)
  {
     super(n,a);
     type=t;
  }
   public void show()
   {
     super.show();
     System.out.println("Player type : "+type);
   }
}
class hockey_player extends Testing
{
   String type; 
   hockey_player(String n,String t,int a)
   {
      super(n,a);
      type=t;
   }
   public void show()
   {
      super.show();
      System.out.println("Player type : "+type);
   }
}
class Demo
{
   public static void main(String args[])
   {
     cricket_player c=new cricket_player("Ankit","Cricket",20);
     football_player f=new football_player("Namrata","Football",21);
     hockey_player h=new hockey_player("Aditya","Hockey",22);
     c.show();
     f.show();
     h.show();
   }
}
