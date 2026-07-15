package AdvancedRecursion.Trees.BinaryTrees;

public class FindMinimumHeightOfTree extends TreeNode{
    public static int minHeight(TreeNode root){
        if(root == null) return 0 ;
        if(root.left==null && root.right==null) return 1 ;
        if(root.left==null) return 1+minHeight(root.right);
        if(root.right==null) return 1+minHeight(root.left);

        int leftMin = minHeight(root.left) ;
        int rightMin = minHeight(root.right) ;
        return 1+Math.min(leftMin , rightMin) ;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.left.right.left = new TreeNode(7);
        root.right.left = new TreeNode(9);

        System.out.println(minHeight(root));
    }

}
