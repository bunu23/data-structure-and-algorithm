
public class ArrayUtil {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.arrayDemo();
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5];
        printArray(myArray);
        myArray[0] = 5;
        myArray[1] = 3;
        myArray[2] = 4;
        myArray[3] = 8;
        myArray[4] = 9;
        printArray(myArray);

        myArray[4] = 12;
        printArray(myArray);

        System.out.println("Length of Array is " + myArray.length);
        System.out.println("Last element of Array is " + myArray[myArray.length - 1]);
        /*
         * myArray[5]=33; // Array index out of bound since 5 is out of bounds for
         * length 5
         * printArray(myArray);
         */

        int[] arr = { 3, 2, 5, 6, 2, 2, 6, 8 };
        printArray(arr);
    }
}
