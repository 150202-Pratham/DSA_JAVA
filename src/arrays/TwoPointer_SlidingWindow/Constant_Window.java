package arrays.TwoPointer_SlidingWindow;

public class Constant_Window {

    public static void main(String[] args) {

        int arr [] = {-1 ,2,3,3,4,5,-1} ;
        int k = 4 ;

        int start = 0 ;
        int end = k-1 ;

        int sum = 0 ;

        for(int i = start ; i<=end ; i++ ){
            sum+=arr[i] ;

        }

        int max_Sum = sum ;

        while(end<arr.length-1){
            sum = sum-arr[start] ;

            start++ ;
            end++ ;

            sum += arr[end] ;

            max_Sum = Math.max(max_Sum , sum) ;
        }


        System.out.println(max_Sum);




    }
}
