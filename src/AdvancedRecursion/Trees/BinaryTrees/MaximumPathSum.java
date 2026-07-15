package AdvancedRecursion.Trees.BinaryTrees;

public class MaximumPathSum extends TreeNode {
    static int maxSum = Integer.MIN_VALUE;
    public static int maxPathSum(TreeNode root){
        if(root==null) return 0 ;
        int left = Math.max(0, maxPathSum(root.left));
        int right = Math.max(0, maxPathSum(root.right));

        maxSum = Math.max(maxSum , left+right+root.value) ;

        return root.value+Math.max(left,right) ;


    }
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(-10) ;
//        root.left = new TreeNode(9) ;
//        root.right = new TreeNode(20) ;
//        root.right.left = new TreeNode(15) ;
//        root.right.right = new TreeNode(7) ;

        TreeNode root = new TreeNode(-3) ;


        maxPathSum(root) ;
        System.out.println(maxSum);
    }
}
