package arrays;

public class Minimum_size_Subarray_Sum {
    public static int sum_Min_subarray(int []arr , int t){
        int l = 0 , r  = 0 ;

        int sum = 0 ;

        int min_size = Integer.MAX_VALUE ;

        while(r<arr.length){

            sum+=arr[r] ;

            while(sum>=t){
                min_size = Math.min(min_size,(r-l)+1) ;
                sum = sum-arr[l] ;
                l = l+1 ;

            }
            r+=1 ;


        }
        return min_size==Integer.MAX_VALUE?0:min_size ;


    }
    public static void main(String args[]){

        int []arr = {2,3,1,2,4,3} ;

        int target = 7 ;

        System.out.println(sum_Min_subarray(arr , target)) ;


    }
}
