public class Array_demo {
    public static void main(String[] args) {
        int [] arr = new int[] {1, 45, 6, 89, 2};  
        int temp;

        for(int i=0; i<arr.length-1; i++) {
            for (int j=i+1 ; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array is : ");
        
        for(int i = 0; i<arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
