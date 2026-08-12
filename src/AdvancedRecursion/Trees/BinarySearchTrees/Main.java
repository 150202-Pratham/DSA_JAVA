package AdvancedRecursion.Trees.BinarySearchTrees;

public class Main {

    public static void main(String[] args) {
        Implementation bst = new Implementation() ;

        Implementation.TreeNode root = null ;

        int [] arr = {8,3, 10,1,6} ;

        for(int val : arr){
            root = bst.insert(root , val) ;
        }
//        Here insertion Cost ( average case ) -> o( log n ) ;
//        if it is skewed Tree ( worst case ) -> o( n ) ;
        bst.traverse(root);


    }
}
