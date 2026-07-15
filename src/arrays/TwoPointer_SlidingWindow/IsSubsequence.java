package arrays.TwoPointer_SlidingWindow;

public class IsSubsequence {

    public static void main (String []args){

        int i = 0 , j = 0 ;
        String s = "abc" ;
        String t = "ahbgdc" ;

        while(i<s.length() && j<t.length()){

            if(s.charAt(i) == t.charAt(j)){

                i++ ;

            }
            j++ ;

        }


        System.out.println(i==s.length()) ;


    }


}
