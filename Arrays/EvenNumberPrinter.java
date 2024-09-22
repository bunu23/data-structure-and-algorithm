
// To print elements from the array that are even numbers.
public class EvenNumberPrinter {
    public static void main(String[] args) {

        int[] number={3,5,2,45,6,8,90};
        evenIndex(number);

    }

    public static void evenIndex(int[] arr){
        if (arr == null) {
            System.out.println("Array is null.");
            return;
        }
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
