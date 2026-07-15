package AdvancedRecursion.Trees.BinaryTrees.Traversals;

import AdvancedRecursion.Trees.BinaryTrees.TreeNode;

public class InOrderTraversal {
    public static void dfs(TreeNode root){
        if(root == null) return ;
        dfs(root.left) ;
        System.out.print(root.value +" ");
        dfs(root.right) ;

    }
    public static void main (String []args){
        TreeNode root = new TreeNode(1) ;
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(3) ;
        root.left.left = new TreeNode(4) ;
        root.left.right = new TreeNode(5) ;
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(8) ;
        root.right.right.left = new TreeNode(9) ;

        dfs(root) ;

    }
}
