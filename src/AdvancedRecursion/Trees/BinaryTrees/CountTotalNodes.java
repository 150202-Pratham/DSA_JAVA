package AdvancedRecursion.Trees.BinaryTrees;

import javax.swing.tree.TreeNode;

public class CountTotalNodes {
    public static  class Tree{
        int value ;
        Tree leftNode ;
        Tree rightNode ;

        public Tree(int value){
            this.value = value ;
        }

    }
    public static int countNodes(Tree root){
        if(root == null) return 0 ;
        int count = 1;
        count+= countNodes(root.leftNode);
        count+= countNodes(root.rightNode);
        return count;

    }
    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.leftNode = new Tree(2);
        root.rightNode = new Tree(3);
        root.leftNode.leftNode = new Tree(4);
        root.leftNode.rightNode = new Tree(5);
        root.rightNode.leftNode = new Tree(6);

        int count = countNodes(root);
        System.out.println(count);
    }
}
