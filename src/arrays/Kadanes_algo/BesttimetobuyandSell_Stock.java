package arrays.Kadanes_algo;

public class BesttimetobuyandSell_Stock {

    public static int Buy_Sell_Stock(int []arr){

        int buy = arr[0] ;
        int profit  = 0 ;

        for(int i = 0 ;i<arr.length ; i++){

            if(arr[i]<=buy){

                buy = arr[i] ;


            }

            profit = Math.max(profit , arr[i]-buy) ;


        }


        return profit ;


    }


    public static void main(String []args){

        int []arr = {7,1,5,3,6,4} ;

        int output = Buy_Sell_Stock(arr) ;

        System.out.println(output) ;




    }


}
