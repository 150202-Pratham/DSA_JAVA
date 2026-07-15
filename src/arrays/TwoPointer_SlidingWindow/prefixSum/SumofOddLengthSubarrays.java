package arrays.TwoPointer_SlidingWindow.prefixSum;

public class SumofOddLengthSubarrays {

    public static void oddlengthsubarray(int arr[]){

        int finalsum = 0 ;

        for(int i = 0 ; i<arr.length ; i++){
            int sum = 0 ;

            for(int j = i ; j<arr.length ; j++){
               sum+=arr[j] ;

                if((j-i+1)%2!=0){
                    finalsum+=sum ;

                }
            }

        }

        System.out.println(finalsum);






    }

    public static void main(String[] args) {

        int arr[] = {1,4,2,5,3} ;

      oddlengthsubarray(arr);


    }


}
