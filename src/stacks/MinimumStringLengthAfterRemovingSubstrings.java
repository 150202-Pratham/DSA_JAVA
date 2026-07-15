package stacks;

public class MinimumStringLengthAfterRemovingSubstrings {

    public static void main(String []args){

        String word = "ABFCACDB" ;

        while(word.contains("AB") || word.contains("CD")){

            if(word.contains("AB")){

                word = word.replace("AB" , "") ;

            }
            if(word.contains("CD")){

                word = word.replace("CD" , "") ;

            }
        }


        System.out.println(word.length());


    }

}
