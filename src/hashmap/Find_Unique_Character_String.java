package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Find_Unique_Character_String {
    public static int index_UniqueCharacter( String a){

        char arr [] = a.toCharArray() ;

        Map<Character , Integer> mymap = new HashMap<>() ;

        for(Character  i : arr){
            mymap.put( i , mymap.getOrDefault(i , 0)+1)  ;

        }

        for(int i = 0 ; i<arr.length ; i++){

            if(mymap.get(arr[i])==1){
                return i  ;


            }
        }

        return -1  ;
    }
    public static void main(String []args){

        String str_1 = new String("HelloWorld") ;

        System.out.println(index_UniqueCharacter(str_1)) ;


    }
}
