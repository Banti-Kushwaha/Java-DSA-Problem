public class LargestInArray {
    public static int largestNum(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[]={3,5,6,7,9,3,2};
        int largest=largestNum(arr);
        System.out.println("Largest Element is:"+largest);
    }
}
