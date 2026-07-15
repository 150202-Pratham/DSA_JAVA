package arrays.TwoPointer_SlidingWindow;

public class LongestSubstring_repeatingCharacters {

//    BruteForce Solution

    public static int longest_substring(String a , int n){

        int max_len = 0 ;

        for(int i = 0 ; i<a.length() ; i++){

            int []arr = new int[n] ;

            for(int j = 0 ; j<a.length(); j++){

                if(arr[a.charAt(j)]==1) break  ;

                max_len = Math.max(max_len , j-i+1) ;
                arr[a.charAt(j)] = 1 ;

            }





        }

        return max_len ;
    }

//    public static int longest_substring(String a){
//        int max_len = 0 ;
//
//        for(int i = 0 ; i<a.length() ; i++){
//
//            int []arr = new int [256] ;
//            itn
//
//        }
//        return max_len ;
//
//
//    }
    public static void main(String []args){

        String a = "ABAB" ;

       int n = 256 ;


       System.out.println( longest_substring(a , n)  );


    }


}
