public class MaxSubArraySum {
    public static void maxsubarrsum(int[] arr){
        int currsum=0;
        int Maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum=currsum+arr[k];
                }
                System.out.println(currsum);
                if(Maxsum<currsum){
                    Maxsum=currsum;
                }
                
            }
           
        }
        System.err.println("Max Sum :"+Maxsum);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        maxsubarrsum(arr);
    }
}
