public class MaxSubArraySumPrifixSum {
    public static void maxsubarrsumPrifix(int[] arr){
        int currsum=0;
        int Maxsum=Integer.MIN_VALUE;
        
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                
                currsum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(Maxsum<currsum){
                    Maxsum=currsum;
                }
                
            }
           
        }
        System.err.println("Maximum Sum :"+Maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxsubarrsumPrifix(arr);
    }
}
