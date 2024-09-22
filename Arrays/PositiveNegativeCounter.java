

//function that counts how many positive and negative numbers are in an array
public class PositiveNegativeCounter {
    public static void main(String[] args) {
int[] number={1,2,3,-4,-2,2,11};
int[] counts=countPositiveNegative(number);
        System.out.println("positive count "+counts[0]);
        System.out.println("negative count "+counts[1]);
    }

    public static int[] countPositiveNegative(int[]arr){
        int positiveCount=0;
        int negativeCount=0;
        for(int num:arr){
            if(num>0)
                positiveCount++;
            else if(num<0)
                negativeCount++;
        }
        return new int[]{positiveCount,negativeCount};
    }
}
