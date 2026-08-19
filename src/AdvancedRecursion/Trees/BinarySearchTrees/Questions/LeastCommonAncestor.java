package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

public class LeastCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root , TreeNode p , TreeNode q){
        if(root==null || root==p || root ==q){
            return root ;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right, p, q) ;

        if(left!=null && right!=null){
            return root ;

        }
        if(left!=null) return left ;
        return right ;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6) ;
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(8) ;
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4) ;
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5) ;

        TreeNode p = new TreeNode(3) ;
        TreeNode q = new TreeNode(5) ;


        LeastCommonAncestor obj = new LeastCommonAncestor() ;
        System.out.println((obj.lowestCommonAncestor(root,p , q)).val) ;

    }
}
