package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

public class SearchInBST {
   public static boolean searchInBst(TreeNode root , int key){
         if(root == null){
             return false;
         }

         if(root.val==key){
             return true ;
         }
         if(root.val>key){
             return searchInBst(root.left , key) ;
         }
         return searchInBst(root.right , key) ;


   }
    public static void main(String[] args) {

        SearchInBST obj = new SearchInBST() ;
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70 );
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        System.out.println(obj.searchInBst(root,60)) ;

    }
}
