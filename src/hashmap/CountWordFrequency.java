package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWordFrequency {
    public static String checkFrequency(String str){

        Map<Character , Integer> map = new TreeMap<>() ;

        for(char st: str.toCharArray()) {
            map.put(st , map.getOrDefault(st , 0)+1) ;
        }

        StringBuilder output = new StringBuilder();
        for(Map.Entry<Character , Integer> mapItem: map.entrySet()){

            output.append(mapItem.getKey()) ;
            output.append(mapItem.getValue());
            output.append(" ") ;
            

        }

        return output.toString().trim();


    }
    public static void main(String[] args) {
        String str = "helloworld" ;

        String answer = checkFrequency(str) ;

        System.out.println(answer);


    }
}
