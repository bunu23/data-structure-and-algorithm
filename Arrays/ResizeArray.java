

public class ResizeArray {
    public static void main(String[] args) {
int[] originalArray={1,2,3,4,5,6,7};
int newCapacity=10;
int[] resizedArray=resize(originalArray,newCapacity);

        for (int num : resizedArray) {
            System.out.print(num + " "); // Print the contents
        }
    }

    public static int[] resize(int[]arr,int capacity){
        int[]temp=new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    }

}
