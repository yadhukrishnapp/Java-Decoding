class items{
	int a;
	String b;
	items(int c,char d){
		a = c;
	}
	items(String string){
		int a = 0;
		b = string;
	}
	public void add(int e) {
		a = a + e;
	}
	public void add(String e) {
		b = b + e;
	}
}
public class add {
public static void main(String args[]) {
	items i1 = new items(7,'i');
	items i2 = new items("Hello World ");
	System.out.println(i1.a);
	System.out.println(i2.b);
	i1.add(5);
	i2.add("Good day");
	System.out.println(i1.a);
	System.out.println(i2.b);
    }
}