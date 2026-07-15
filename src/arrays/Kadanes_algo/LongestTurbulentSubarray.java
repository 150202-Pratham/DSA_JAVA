package arrays.Kadanes_algo;

public class LongestTurbulentSubarray {
    public static int sign(int a , int b){
        if(a>b) return 1 ;
        if(a<b) return -1 ;

        return  0 ;

    }


    public static int maxTurbulenceSize(int[] arr) {

        int  start = 0 ;
        int compare = 1 ;
        int maxlength = 1 ;


        for(int i = 1 ; i< arr.length-1 ;i++ ){

            compare = sign(arr[i-1],arr[i]) ;

            if(compare==0){
                start = i ;

            }

            else if(i==arr.length-1 || compare * sign(arr[i] , arr[i+1])!=-1){

                maxlength = Math.max(maxlength , i-start+1) ;

                start = i ;
            }

        }


        return maxlength ;



    }
    public static void main(String[] args) {
        int []arr = {9,4,2,10,7,8,8,1,9} ;

        System.out.println(maxTurbulenceSize(arr));
    }
}
