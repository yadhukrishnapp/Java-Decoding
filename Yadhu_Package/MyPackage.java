package Yadhu_Package;

public class MyPackage {
    public void show() {
        System.out.println("This is Yadhu's package");
    }

    public void factorial(int x) {
        int f = 1;
        for (int j = 2; j <= x; j++) {
            f = f*j;
        }
        System.out.println("The factorial is :" +f);
    }
}
