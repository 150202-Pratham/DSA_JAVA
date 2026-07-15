package arrays.TwoPointer_SlidingWindow;

public class Max_Consequitive_Ones_III {

  public static int max_Consequitive(int arr[] , int k){

      int max_len = 0 , l = 0 , r = 0 , zeroes =0 , len = 0 ;

      while(r<arr.length){

          if(arr[r]==0){
              zeroes++ ;


          }

          while(zeroes>k){

              if(arr[l]==0){
                  zeroes -- ;

              }

              l++ ;

          }

          if(zeroes<=k){
              len = r-l+1 ;

              max_len = Math.max(len , max_len) ;


          }

          r++ ;


      }



      return max_len ;


  }
    public static void main(String []args){

        int arr[] = {1 ,1,1,0,0,0,1,1,1,1,0} ;

        int k = 2 ;

       int solution =  max_Consequitive(arr , k) ;

        System.out.println(solution) ;




    }
}
