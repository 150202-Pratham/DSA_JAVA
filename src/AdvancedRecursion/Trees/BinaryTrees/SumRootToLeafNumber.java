package AdvancedRecursion.Trees.BinaryTrees;

public class SumRootToLeafNumber extends TreeNode {


    public static int dfs(TreeNode root ,  int current){
        if(root==null) return 0 ;
        current = current *10 + root.value ;

        if(root.left==null && root.right==null){
            return current;
        }
        return dfs(root.left , current) + dfs(root.right,current) ;
    }

    public static void main(String []args){
        TreeNode root  = new TreeNode(1);
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(3) ;

        System.out.println(dfs( root, 0));
    }
}
