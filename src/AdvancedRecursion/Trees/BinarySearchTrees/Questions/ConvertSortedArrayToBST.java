package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

public class ConvertSortedArrayToBST {
    public static TreeNode convert(int []nums , int low , int high){
        if(low>high) return null ;
        int mid = low  + (high-low) /2 ;

        TreeNode root = new TreeNode(nums[mid]) ;
        root.left = convert(nums , low , mid-1) ;
        root.right = convert( nums , mid+1, high) ;

        return root ;
    }
    public static void main(String[] args) {

        int []nums = {-10,-3,0,5,9} ;

        ConvertSortedArrayToBST csat =  new ConvertSortedArrayToBST() ;

        TreeNode root = csat.convert(nums , 0 , nums.length-1) ;

        root.Traversal(root);



    }
}
