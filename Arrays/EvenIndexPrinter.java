
 //program that prints the elements of an array that are located at even indexes
public class EvenIndexPrinter {

     public static void main(String[] args) {
int[]num={2,22,222,20,22};
printEvenIndexes(num);
     }

     public static void printEvenIndexes(int[]arr){
         for(int i=0;i<arr.length;i+=2){
             System.out.println("The element at index "+i+ " is "+arr[i] );
         }
     }
}
