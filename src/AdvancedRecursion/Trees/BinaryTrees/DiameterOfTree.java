package AdvancedRecursion.Trees.BinaryTrees;

public class DiameterOfTree extends  TreeNode{
    static int diameter = 0 ;

    public static int diameterBruteForce(TreeNode root){
        if(root==null){
            return  0;
        }
        int output = height(root.left)+ height(root.right) ;


        int leftMax = diameterBruteForce(root.left) ;
        int rightMax = diameterBruteForce(root.right) ;

        return Math.max(output , Math.max(leftMax , rightMax)) ;

    }

    public static int diameterOptimal(TreeNode root){
        if(root==null) return 0 ;

        int left = diameterOptimal(root.left) ;
        int right = diameterOptimal(root.right) ;

        diameter = Math.max(diameter , left+right) ;
        return 1+Math.max(left , right) ;


    }

    public static int height(TreeNode root){
        if(root==null) return 0 ;
        return 1+Math.max(height(root.left) , height(root.right)) ;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(7) ;


        /*System.out.println(diameterBruteForce(root));*/
        diameterOptimal(root);
        System.out.println(diameter);
    }
}
