package arrays.TwoPointer_SlidingWindow;

import java.util.HashSet;
import java.util.List;

public class PointsThatIntersetCars {
    public int numberOfPoints(List<List<Integer>> nums) {


        HashSet<Integer> myset = new HashSet<>() ;

        for(List<Integer> num: nums){

            for(int i = num.get(0) ; i<=num.get(1) ; i++ ){

                myset.add(i) ;

            }
        }


        return myset.size();


    }
    public static void main(String[] args) {

    }
}
