public class StrDemo {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
    System.out.println("Ref s1" + "\t" + Integer.toHexString(System.identityHashCode(s1)));
    System.out.println("Ref s2" + "\t" + Integer.toHexString( System.identityHashCode(s2)));
    String s3 = new String("XYZ");
    String s4 = new String("ABC");
    System.out.println("Ref s4" + "\t" + Integer.toHexString(System.identityHashCode(s4)));
    if (s1 == s2){
    System.out.println("Same");
    }
    else{
    System.out.println("Not Same");
    }
}

}