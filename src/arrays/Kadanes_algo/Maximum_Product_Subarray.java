package arrays.Kadanes_algo;

public class Maximum_Product_Subarray {

    public static void main(String[] args) {

        int []arr = {-2,3,4,-1,0,-2,3,1,4,0,4,6,-1,4} ;

        int pre = 1 ;
        int suff = 1 , maxi = Integer.MIN_VALUE ;

        for (int i = 0; i < arr.length; i++) {

            if(pre==0) pre =1  ;
            if(suff == 0) suff =1 ;

            pre *= arr[i] ;
            suff *= arr[arr.length-i-1];

            maxi = Math.max(maxi , Math.max(pre , suff)) ;




        }

        System.out.println(maxi);

    }



}
