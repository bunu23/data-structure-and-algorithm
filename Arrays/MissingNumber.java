

public class MissingNumber {
    public static void main(String[] args) {

        MissingNumber missingNumber=new MissingNumber();
        int[] arr={1,2,4,5,6,7};
      int missingNum=  missingNumber.findMissingNumber(arr);

        System.out.println("The missing number is: " + missingNum);
    }

    public int findMissingNumber(int[] arr){
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr){
            sum=sum-num;
        }
        return sum;
    }


}
