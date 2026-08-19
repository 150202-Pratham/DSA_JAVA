package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

public class RangeSumBST {
    public static int rangeSum(TreeNode root, int low , int high){
        if(root==null){
            return 0 ;
        }

        if(root.val<low){
            return rangeSum(root.right,low,high);
        }
        if(root.val>high){
            return rangeSum(root.left, low, high) ;

        }

        return root.val + rangeSum(root.left , low , high) + rangeSum(root.right, low , high) ;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10) ;
        root.left = new TreeNode(5);
        root.right = new TreeNode(15) ;
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7) ;
        root.right.right = new TreeNode(18);

        RangeSumBST obj = new RangeSumBST() ;
        System.out.println(obj.rangeSum(root,7,15));



    }
}
