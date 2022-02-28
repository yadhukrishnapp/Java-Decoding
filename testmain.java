public class testmain {

    public static void main(String[] args) {
   System.out.println("This is main() method");
   System.out.println(args[0]);
   testmain.main(5);
   testmain.main("TEST");
   }
   public static void main(int i) {
   System.out.println("This is overloaded main() with int argument" + i);
   }
   
    public static void main(String s) {
   System.out.println("This is overloaded main() with String argument" + s);
   }
}