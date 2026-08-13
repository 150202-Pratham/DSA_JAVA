package AdvancedRecursion.Trees.BinarySearchTrees.Questions;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeNode;

public class DeleteInBST {
    public static TreeNode deleteInBST(TreeNode root, int key) {
        if (root == null) {
            return null ;

        }

        if(root.val > key ){
            root.left = deleteInBST(root.left , key) ;
        }
        else if( root.val < key ){
            root.right = deleteInBST(root.right , key) ;

        }

        else{

            if(root.left == null){
                return root.right ;
            }

            if(root.right == null){
                return root.left ;
            }
            else{

                TreeNode successor = findMin(root.right) ;
                root.val = successor.val ;
                root.right = deleteInBST(root.right , successor.val) ;

            }
        }

        return root ;
    }
    public  static TreeNode findMin(TreeNode root){

        while(root.left!=null){
            root = root.left ;
        }

        return root ;

    }
    public static void main(String[] args) {
        DeleteInBST obj = new DeleteInBST() ;

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70 );
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        TreeNode output = obj.deleteInBST(root , 50) ;
        System.out.println(output.val) ;

    }
}
