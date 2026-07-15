package AdvancedRecursion.Trees.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PathInList extends TreeNode {
    public static void findPath(TreeNode root , List<Integer> list){
        if(root == null) return ;
        list.add(root.value) ;
        if(root.left==null && root.right==null){
            System.out.println(list) ;
        }
        findPath(root.left,list) ;
        findPath(root.right,list) ;
        list.removeLast() ;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(9);

        findPath(root , new ArrayList<>()) ;

    }
}
