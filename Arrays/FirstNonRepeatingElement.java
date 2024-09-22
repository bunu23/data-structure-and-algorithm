
//find the first element that does not repeat
public class FirstNonRepeatingElement {

    public static void main(String[] args) {

        int[] n={3,4,2,3,4,5,6,3};
        int result=findFirstNonRepeating(n);
        System.out.println("first non repeating element: "+result);
    }

    public static int findFirstNonRepeating(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isRepeating=false;
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]==arr[j]){
                    isRepeating=true;
                    break;
                }
            }
            if(!isRepeating){
                return arr[i];
            }
        }
        return -1;
    }

}
