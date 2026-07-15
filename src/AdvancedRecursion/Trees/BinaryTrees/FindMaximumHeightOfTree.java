package AdvancedRecursion.Trees.BinaryTrees;

public class FindMaximumHeightOfTree extends TreeNode {
    public static int maxHeight(TreeNode root){
        if(root==null) return 0 ;

        int leftMax = maxHeight(root.left) ;
        int rightMax = maxHeight(root.right) ;

        return 1+Math.max(leftMax , rightMax) ;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(7) ;
        root.right.left = new TreeNode(9);

        System.out.println(maxHeight(root));

    }
}
