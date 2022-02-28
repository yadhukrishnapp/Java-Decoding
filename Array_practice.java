public class Array_practice {
    public static int[] take_input() {
        int[] arr = new int[] {10, 20, 30, 40, 50};
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = take_input();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
