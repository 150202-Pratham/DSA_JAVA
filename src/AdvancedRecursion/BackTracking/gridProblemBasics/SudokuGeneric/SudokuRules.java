package AdvancedRecursion.BackTracking.gridProblemBasics.SudokuGeneric;

import java.util.List;

public interface SudokuRules<T> {

    boolean isEmpty(T value) ;

    List<T> candidates();

    boolean isSafe(T [][]board , int row , int col , T candidate) ;


}
