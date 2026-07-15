package AdvancedRecursion.Subsequences.PractiseSET1;

public class CountSubsequences {
    public static int countSubsequences(String unprocessed , String processed){
            if(processed.isEmpty()){
                return 1 ;

            }
            int count = 0 ;

            char ch = processed.charAt(0) ;

            count+=  countSubsequences(unprocessed+ch, processed.substring(1)) ;
            count+= countSubsequences(unprocessed, processed.substring(1)) ;

            return count ;

        }
        public static void main(String[] args) {
            String str = "abc" ;
            System.out.println(countSubsequences( "" , str )) ;


        }


}
