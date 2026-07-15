package AdvancedRecursion.Trees.BinaryTrees;

public class ConvertBinaryTreeToDoublyLL extends TreeNode {

    public static class Pair{
        TreeNode head ;
        TreeNode tail ;

        public Pair(TreeNode head,TreeNode tail){
            this.head = head;
            this.tail = tail;
        }
    }
    public static TreeNode Conversion(TreeNode root){
        if(root ==null) return null ;

        Pair p = helper(root) ;
        return p.head ;


    }

    public static Pair helper(TreeNode root) {
        if (root == null) return new Pair(null, null);

        Pair left = helper(root.left);
        Pair right = helper(root.right);

        if (left.tail != null) {
            left.tail.right = root;
            root.left = left.tail;
        }

        if (right.head != null) {
            root.right = right.head;
            right.head.left = root;

        }

        TreeNode head = left.head != null ? left.head : root;
        TreeNode tail = right.tail != null ? right.tail : root;

        return new Pair(head, tail);

    }
    public static void printDLL (TreeNode head){

        if(head==null) return;

        TreeNode temp = head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp = temp.right ;
        }
        System.out.print("X");

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1) ;
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(3) ;
        root.left.left = new TreeNode(4) ;
        root.left.right = new TreeNode(5) ;
        root.left.right.left = new TreeNode(6) ;
        root.right.right = new TreeNode(7) ;
        root.right.right.left = new TreeNode(8) ;

        TreeNode head = Conversion(root);
        printDLL(head) ;

    }

}
