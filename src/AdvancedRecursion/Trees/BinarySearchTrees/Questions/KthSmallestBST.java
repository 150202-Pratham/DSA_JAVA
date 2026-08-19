package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

public class KthSmallestBST {
    public static  int count = 0 ;
    public static int ans = -1 ;

    public static  void kthSmallest(TreeNode root , int k){

        if(root == null){
            return ;
        }

        kthSmallest(root.left , k) ;
        count++;

        if(count==k){
            ans = count ;
            return ;
        }
        kthSmallest(root.right , k) ;


    }
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3) ;
        root.left = new TreeNode(1) ;
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2) ;

        KthSmallestBST obj = new KthSmallestBST() ;
        obj.kthSmallest(root,2);


        System.out.println(ans);

    }


}
