package AdvancedRecursion.GreedyAlgorithmn.GreedyQuestions;

public class LemonadeChange {
    public static boolean lemonadeChange(int[] coins) {
        int sum5 = 0 ;
        int sum10 = 0 ;

        for(int num: coins){
            if(num==5){
                sum5++;
            }
            else if(num==10){
                if(sum5>=1){
                    sum5-- ;
                }
                else return false ;
                sum10++ ;
            }
            else if(num==20){
                if(sum10>=1 && sum5>=1) {
                    sum5-- ;
                    sum10-- ;
                }
                else if(sum5>=3){
                    sum5-=3 ;
                }
                else{
                    return false ;

                }
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int arr[] = {5,5,5,10,20} ;
        System.out.println(lemonadeChange(arr)) ;

    }
}
