package AdvancedRecursion.Subsequences;

public class GridPath {
    public static void showPath(int row , int col , String current){
        if(row==1 && col==1){
            System.out.println(current) ;

        }

        if(row>1)
        showPath(row-1 , col , current+="D") ;
        if(col>1)
        showPath(row , col-1 , current+="R") ;
//        if(row>1 && col>1)
//            showPath(row-1 , col-1 , current+="D") ;
//


    }
    public static void main(String[] args) {

        showPath(3,3 , "");

    }
}
