package hashmap;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection_arrays_2 {
    public static int [] intersect_2(int arr[] , int brr[]){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int i : arr) {
            set1.add(i);
        }

        for (int i : brr) {
            if (set1.contains(i)) {
                resultSet.add(i);
            }
        }

        int[] intersectionArray = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            intersectionArray[index++] = num;
        }

        return intersectionArray;

    }
    public static void main(String []args){

        int [] arr = {4,9,5} ;
        int [] brr = {9,4,9,8,4} ;

        int [] result  = intersect_2(arr,brr)  ;

        System.out.println(Arrays.toString(result)) ;

    }
}
