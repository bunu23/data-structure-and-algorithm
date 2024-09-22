
public class MoveZeroesToEnd {
    public static void main(String[] args) {
//int[] arr={3,0,22,0,3,2,1};
//int n=arr.length;
//moveZeros(arr,n);
//for(int num:arr){
//    System.out.println(num+" ");
//}
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

//    public static void moveZeros(int[] arr, int n){
//        int j=0;
//        for(int i=0;i<n;i++){
//            if(arr[i]!=0&&arr[j]==0){
//                int temp=arr[i];
//                arr[i]=arr[j];
//                arr[j]=temp;
//            }
//            if(arr[j]!=0){
//                j++;
//            }
//        }
//    }

    public static void moveZeros(int[]arr){
        int count=0;
        for(int num:arr){
            if(num!=0){
                arr[count++]=num;
            }
        }
        while(count<arr.length){
            arr[count++]=0;
        }
    }

}
