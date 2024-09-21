public class ArrayDemo {
    public static void main(String[] args) {
        ArrayDemo demo = new ArrayDemo();
        demo.printArray(new int[] { 3, 2, 2, 4, 2 });
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
