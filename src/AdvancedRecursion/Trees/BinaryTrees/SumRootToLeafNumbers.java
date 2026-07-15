package AdvancedRecursion.Trees.BinaryTrees;

public class SumRootToLeafNumbers extends TreeNode {
    public static void rootToLeaf(String leftEmpty ,TreeNode root ,String rightEmpty ){

        if(root==null) return ;

         rootToLeaf(leftEmpty+= String.valueOf(root.value) , root.left , rightEmpty);
         rootToLeaf(leftEmpty , root.right , rightEmpty+= String.valueOf(root.value));


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1) ;
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(3) ;
        String leftEmpty = "" ;
        String rightEmpty = "" ;

        rootToLeaf(leftEmpty,root,rightEmpty) ;
        System.out.println(leftEmpty);
        System.out.println(rightEmpty);


    }
}
