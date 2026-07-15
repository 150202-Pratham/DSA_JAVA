package hashmap;

import java.util.*;

public class FindPlayersWithZeroOrOneLoss {
    public static  List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer,Integer> loosers = new HashMap<>() ;
        Set<Integer> finalSet = new HashSet<>() ;

        for(int i = 0 ; i<matches.length ; i++){
            finalSet.add(matches[i][0]) ;
            finalSet.add(matches[i][1]) ;

            loosers.put(matches[i][1] , loosers.getOrDefault(matches[i][1] , 0)+1) ;

        }
        List<Integer> winners = new ArrayList<>() ;
        List<Integer> loose = new ArrayList<>() ;

        for(int i : finalSet){

            if(loosers.getOrDefault(i , 0 )==0){
                winners.add(i) ;

            }
            else if (loosers.getOrDefault(i , 0)==1) loose.add(i) ;


        }

        Collections.sort(loose);
        Collections.sort(winners) ;


        List<List<Integer>> output = new ArrayList<>() ;

        output.add(winners) ;
        output.add(loose) ;

        return output;

    }
    public static void main(String[] args) {

        int [][]matches =  {{1, 2}, {2, 3}, {4, 3}, {1, 5}} ;

        System.out.println(findWinners(matches)) ;

    }
}
