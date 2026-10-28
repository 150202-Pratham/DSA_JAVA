package AdvancedRecursion.BackTracking.gridProblemBasics.nqueens;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        List<List<String>> output = NQueen.solveNQueens(n);
        System.out.println(output.toString()) ;

    }
}
