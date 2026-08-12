package AdvancedRecursion.Trees.BinarySearchTrees;

public class Implementation {

    public static class TreeNode{

        int value ;
        TreeNode   left ;
        TreeNode right ;

        public TreeNode(int value){
            this.value = value ;
        }
    }

    public static TreeNode insert (TreeNode root , int value){

        if(root == null) return new TreeNode(value) ;

        if(root.value > value){
            root.left = insert(root.left , value ) ;
        }
        else{
            root.right =  insert(root.right , value) ;

        }
        return root ;

    }

    public static void traverse(TreeNode root){
        if(root == null) return ;
        traverse(root.left) ;
        System.out.print(root.value +" ");
        traverse(root.right) ;

    }
}
