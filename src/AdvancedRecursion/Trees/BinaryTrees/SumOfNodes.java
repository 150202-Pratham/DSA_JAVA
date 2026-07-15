package AdvancedRecursion.Trees.BinaryTrees;

public class SumOfNodes {
    public static class TreeNode{
        int val ;
        TreeNode left ;
        TreeNode right ;
        public TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static int countNodes(TreeNode root){
        if(root == null){
            return 0 ;
        }

        int leftSum = countNodes(root.left) ;
        int rightSum = countNodes(root.right) ;
        return leftSum + rightSum + root.val ;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        int count = countNodes(root);
        System.out.println(count);
    }

}

