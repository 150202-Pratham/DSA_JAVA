package arrays.Kadanes_algo;

public class Maximum_Circular_Subarray {

    public int kadanes(int []arr){
        int total = 0 ;
        int maxi = Integer.MIN_VALUE ;
        for(int i = 0 ; i<arr.length ; i++){
            total+=arr[i] ;

            if(total>maxi){
                maxi = total;
            }

            if(total<0){
                total = 0 ;

            }



        }

        return maxi ;



    }
    public int maxSubarraySumCircular(int[] arr) {

        int sum = 0 ;

        int Normal_Max = kadanes(arr) ;

        for(int i = 0 ; i<arr.length ; i++){
            sum+=arr[i] ;
            arr[i] *= -1 ;




        }

        int min_Subarray = kadanes(arr) ;

        int circular_Max = min_Subarray + sum ;

        if(circular_Max == 0) return Normal_Max ;




        return(Math.max(Normal_Max , circular_Max));
    }

}
