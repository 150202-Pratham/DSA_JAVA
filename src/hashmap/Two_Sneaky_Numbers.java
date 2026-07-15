package hashmap;

import java.util.*;

public class Two_Sneaky_Numbers {
    public static void checkSneaky(int [] nums){

        Map<Integer , Integer> mymap =  new HashMap<>();
        List<Integer> mylist = new ArrayList<>();


        int []arr_new = new int [2] ;


        for(int i : nums){
            mymap.put(i , mymap.getOrDefault(i , 0)+1) ;

        }


        for(Map.Entry<Integer , Integer> entry  : mymap.entrySet()){
            if(entry.getValue() == 2){
                mylist.add(entry.getKey()) ;

            }
        }


        for(int i = 0 ; i<mylist.size() ; i++){
            arr_new[i] = mylist.get(i);

        }


        System.out.print(Arrays.toString(arr_new));
    }

    public static void main(String[] args) {

        int [] nums = {0,1,1,0} ;

        checkSneaky(nums);

    }
}
