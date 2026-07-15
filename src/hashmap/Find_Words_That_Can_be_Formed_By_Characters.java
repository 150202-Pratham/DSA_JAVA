package hashmap;

import java.util.HashMap;
import java.util.Map;


public class Find_Words_That_Can_be_Formed_By_Characters{
    public static int find_words(String [] words,String chars){

        Map<Character , Integer> countChars = new HashMap<>() ;

        for(Character i : chars.toCharArray()){

            countChars.put(i,countChars.getOrDefault(i,0)+1) ;


        }
        int ans = 0  ;
        for(String word  : words){
            Map<Character , Integer> counter_newWord = new HashMap<>() ;

            for(Character c : word.toCharArray()){
                counter_newWord.put(c, counter_newWord.getOrDefault(c , 0 )+1 ) ;
            }


            boolean good = true ;

            for(Character c  : counter_newWord.keySet()){

                if(countChars.getOrDefault(c,0)<counter_newWord.get(c)){
                    good = false ;
                    break ;

                }

            }

            if(good){
                ans+=word.length() ;

            }





        }

return ans ;



    }
    public static void main(String []args){



        String [] words = {"cat","bt","hat","tree"} ;
        String chars = "atach" ;

        System.out.println(find_words(words , chars));





    }
}
