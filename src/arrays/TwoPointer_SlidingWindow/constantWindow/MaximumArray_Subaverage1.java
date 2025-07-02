package arrays.TwoPointer_SlidingWindow.constantWindow;

public class MaximumArray_Subaverage1 {
    public static  double findMaxAverage(int[] arr, int k) {

        int l = 0 , r = k-1;
        double average = 0 ;


        for(int i = l ; i<=r ; i++){

            average += arr[i];



        }

       double maxsum = average ;


        while(r+1<arr.length-1){

            average = average-arr[l] ;
            l++ ;
            r++ ;
            average = average+arr[r] ;

            maxsum = Math.max(maxsum , average) ;

        }



        return maxsum/k;


    }
    public static void main(String[] args) {


        int []arr = {1,12,-5,-6,50,3};
        int k = 4 ;

        double output  = findMaxAverage(arr , k) ;

        System.out.printf("%.5f\n" ,output);

    }
}
