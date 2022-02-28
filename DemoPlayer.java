class Player
{
  String name;
  int age;
  Player(String n,int a)
  { name=n; age=a; }
  void show()
  {
     System.out.println("Player name: "+name);
     System.out.println("Age: "+age);
  }
}
class football_player extends Player
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
class cricket_player extends Player
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
class chess_player extends Player
{
   String type; 
   chess_player(String n,String t,int a)
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
public class DemoPlayer
{
   public static void main(String args[])
   {
     football_player c=new football_player("Yadhu","Football",21);
     cricket_player f=new cricket_player("Abhinav","Cricket",20);
     chess_player h=new chess_player("Shyam","Chess",19);
     c.show();
     f.show();
     h.show();
   }
}