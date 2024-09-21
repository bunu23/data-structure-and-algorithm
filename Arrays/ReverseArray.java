
public class ReverseArray {
    public static void main(String[] args) {
        int[] number = { 2, 3, 5, 6, 7 };
        printArray(number);
        reverseArray(number, 0, number.length - 1);
        printArray(number);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void reverseArray(int[] n, int start, int end) {
        while (start < end) {
            int temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
    }
    // }
    // public static void reverseArray(int[] n){
    // int start=0;
    // int end=n.length-1;
    // while (start<end){
    // int temp=n[start];
    // n[start]=n[end];
    // n[end]=temp;
    // start++;
    // end--;
    //
    // }
    // }

}
