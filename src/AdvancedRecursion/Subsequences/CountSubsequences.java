package AdvancedRecursion.Subsequences;



public class CountSubsequences {
    public static int countSubSequence(String p , String up){
        if(p.length()>4){
            return 0 ;


        }
        if(up.isEmpty()){

            if(p.equals("XYXY")|| p.equals("YXYX"))
               return 1  ;


            return 0;

        }

       int left =  countSubSequence(p+up.charAt(0) , up.substring(1));
       int right =   countSubSequence(p, up.substring(1));

       return left+right ;




    }
    public static void main(String[] args) {
        String up = "XYXYYYXY" ;

        System.out.println(countSubSequence("" ,up ));


    }

}
