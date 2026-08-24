package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class TwoSumBST {

    static Set<Integer> set = new HashSet<>() ;
    public static boolean findTarget(TreeNode root , int k){
        if(root == null) return false ;

        if(set.contains(k-root.val)){
            return true ;
        }

        set.add(root.val) ;

        return findTarget(root.left , k) || findTarget(root.right , k) ;


    }
    public static void main(String[] args) {

        TwoSumBST obj = new TwoSumBST() ;
        TreeNode root = new TreeNode(5) ;
        root.left = new TreeNode(3) ;
        root.right = new TreeNode(6) ;
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4) ;

        System.out.println(obj.findTarget(root, 9)) ;

    }
}
