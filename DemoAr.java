public class DemoAr {
    public static int[] inputAr() {
        int[] ar = new int[] {1,2,3,4,5};
        return ar;
    }

    public static void main(String[] args) {
        int[] myAr = inputAr();

        System.out.println(myAr.length);

        for (int i = 0; i < myAr.length; i++) {
            System.out.println(myAr[i]);
        }
    }
}
