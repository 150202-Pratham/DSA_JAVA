package arrays.TwoPointer_SlidingWindow;

public class Maximum_PointsFromCard {
    public static int maximum_cards(int []arr , int k){

        int lsum = 0 , rsum = 0 , max_Sum = 0 ;

        for(int i = 0 ; i<=k-1 ; i++){

            lsum+= arr[i] ;

            max_Sum = lsum  ;
        }
        int r_index = arr.length-1 ;


        for(int j = k-1 ; j>=0 ; j--){

            lsum = lsum-arr[j] ;

            rsum = rsum+arr[r_index] ;

            r_index-=1 ;

            max_Sum = Math.max(max_Sum,lsum+rsum);
        }


        return max_Sum ;


    }
    public static void main(String args[]){
        int []arr  = {6,2,3,4,7,2,1,7,1} ;

        int k = 4 ;


        System.out.println(maximum_cards(arr , k)) ;


    }
}
