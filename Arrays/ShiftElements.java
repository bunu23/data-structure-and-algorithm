
import java.util.Arrays;

//WAP that shifts all elements of an array to the left by one position.
public class ShiftElements {
    public static void main(String[] args){
        int[] num={1,2,4,5,6};
        System.out.println("original array is  "+ Arrays.toString(num));
        shiftLeft(num);
        System.out.println("shifted element is "+Arrays.toString(num));


    }

    public static void shiftLeft(int[] arr){
        if(arr==null||arr.length<=1){
            return;
        }
        int firstElement=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];

        }
        arr[arr.length-1]=firstElement;
    }
}


