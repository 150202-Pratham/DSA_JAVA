package hashmap;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        int maxlen = 0 ;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1) ;
        }

        for(Map.Entry<Integer,Integer> mapit : map.entrySet()){
            int key = mapit.getKey();
            int value = mapit.getValue();

            if(map.containsKey(key+1)){

                maxlen = Math.max(maxlen, value + map.get(key+1)) ;

            }



        }

        return maxlen ;

    }
    public static void main(String[] args) {
        int []nums = {1,3,2,2,5,2,3,7} ;

        System.out.println(findLHS(nums));

    }
}
