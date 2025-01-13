public class MazSubKadanes {
    public static void kadanes(int arr[]){
       int ms = Integer.MIN_VALUE;
       int cs = 0;

       for(int i=0;i<arr.length;i++){
          cs = cs + arr[i];
        
          if(cs<0){
            cs=0;
          }
          ms=Math.max(cs, ms);
       }
       System.out.print("Max sub array:"+ms);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        kadanes(arr);
    }
}
