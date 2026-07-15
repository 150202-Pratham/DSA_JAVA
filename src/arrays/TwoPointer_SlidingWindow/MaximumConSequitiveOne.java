package arrays.TwoPointer_SlidingWindow;

public class MaximumConSequitiveOne {

    public static int find_maxConsequitive(int []arr){

        int zeroes = 0 , len = 0 , max_len = 0  ;

        int r = 0 , l = 0 ;

        while(r<arr.length){

            if(arr[r]==0){

                zeroes++ ;
            }

            while(zeroes>=1){

                if(arr[l]==0){
                    zeroes-- ;
                }

                l++ ;

            }
            if(zeroes <1){
                len = r-l +1 ;
                max_len = Math.max(len , max_len) ;


            }

            r++ ;


        }



        return max_len ;





    }
    public static void main(String args[]){

        int []arr = {1 , 1 , 0,1,1,1} ;

        System.out.println(find_maxConsequitive(arr)) ;


    }
}
