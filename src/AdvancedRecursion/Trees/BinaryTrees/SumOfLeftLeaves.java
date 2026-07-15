package AdvancedRecursion.Trees.BinaryTrees;

public class SumOfLeftLeaves {
    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) { val = x; }
    }
    public static   int countLeftLeaves(TreeNode root){
       if(root == null) return 0 ;
       if(root.left!=null && root.left.left==null && root.left.right==null) return root.left.val ;

       int leftSum = countLeftLeaves(root.left);
       countLeftLeaves(root.right);

       return leftSum ;


    }
    public static int helper(TreeNode root , boolean leftFlag){
        if(root==null) return 0 ;
        if(leftFlag && root.right==null && root.left==null){
            return root.val ;
        }

        return helper(root.left, true) +  helper(root.right, false) ;
    }
    public static int countLeftLeaves2(TreeNode root){
        if(root==null)return 0 ;

        return helper(root, false) ;

    }
    public static void main(String[] args) {
       TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        int count = countLeftLeaves(root);
        int count2 =  countLeftLeaves2(root);

        System.out.println(count2);
    }


}
