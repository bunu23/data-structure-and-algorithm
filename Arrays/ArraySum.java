

public class ArraySum {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5};
        int sum=calculateSum(numbers);
        System.out.println("The sum of the array element is "+sum);
    }

    public static int calculateSum(int[]arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }

}
