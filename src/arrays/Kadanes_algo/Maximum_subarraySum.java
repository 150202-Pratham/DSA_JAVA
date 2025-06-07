package arrays.Kadanes_algo;

public class Maximum_subarraySum {
    public static int maximum_Sum(int arr[]){
        int sum = 0 , maximum_sum = Integer.MIN_VALUE ;


        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];

            if(sum>maximum_sum){
                maximum_sum = Math.max(maximum_sum , sum) ;

            }


            if(sum<0){
                sum = 0 ;

            }


        }

        return maximum_sum;




    }

    public static void main(String []args){

        int []arr = {-2,-3,4,-1,-2,1,5,-3} ;

        int result = maximum_Sum(arr) ;

        System.out.println(result) ;






    }
}
