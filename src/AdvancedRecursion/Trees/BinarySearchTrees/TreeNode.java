package AdvancedRecursion.Trees.BinarySearchTrees;

public class TreeNode {

    public int val ;
    public TreeNode left ;
    public TreeNode right ;

    public TreeNode(int val){
        this.val = val ;

    }
    public void Traversal(TreeNode root){
        if(root==null) return ;

        Traversal(root.left) ;
        System.out.println(root.val) ;
        Traversal(root.right) ;
    }
}
