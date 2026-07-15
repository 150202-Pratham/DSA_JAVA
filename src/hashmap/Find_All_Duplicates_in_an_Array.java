package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_All_Duplicates_in_an_Array {

    public static List<Integer> find_duplicates(int [] nums){

        Map<Integer , Integer> map = new HashMap<>() ;
        List<Integer> mylist = new ArrayList<>() ;
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0)+1) ;

        }

        for(Map.Entry<Integer , Integer> element : map.entrySet() ){
            if(element.getValue()==2){
                mylist.add(element.getKey()) ;
            }
        }


        return mylist  ;







    }
    public static void main(String []args){

        int [] arr = {4,3,2,7,8,2,3,1} ;

        System.out.print(find_duplicates(arr ));

    }
}
