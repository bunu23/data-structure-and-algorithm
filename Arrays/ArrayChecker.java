
//Implement a method to check if an array is empty or not
public class ArrayChecker {
    public static void main(String[] args) {
        int[] numbers={1};
        System.out.println("Is the array empty? " + isEmpty(numbers));
    }

    public static boolean isEmpty(int[] arr){
        return arr.length==0;
    }
}
