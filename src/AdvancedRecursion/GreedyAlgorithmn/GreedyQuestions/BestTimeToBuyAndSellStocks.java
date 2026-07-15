package AdvancedRecursion.GreedyAlgorithmn.GreedyQuestions;

public class BestTimeToBuyAndSellStocks {
    public static int maxProfit(int []arr){
        int profit = 0 ;

        for(int i = 1 ; i<arr.length ; i++){
            if(arr[i-1]<arr[i]){
                profit += arr[i]-arr[i-1] ;

            }
        }

        return profit ;

    }
    public static void main(String []args){

        int arr [] = {7,1,5,3,6,4} ;
        System.out.println(maxProfit(arr));

    }
}
