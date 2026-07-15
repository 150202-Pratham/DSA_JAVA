package AdvancedRecursion.Trees.BinaryTrees.PathQuestions;

import AdvancedRecursion.Trees.BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths extends TreeNode {
    public static List<String> findPaths(TreeNode root , String sb){
        List<String> output = new ArrayList<>() ;

        if(root==null){
            return new ArrayList<>() ;
        }

        if(root.left==null && root.right==null){
            output.add(sb+root.value) ;
            return output;

        }
        List<String> left = findPaths(root.left, sb+ String.valueOf(root.value)+"->") ;
        List<String> right = findPaths(root.right, sb+ String.valueOf(root.value)+"->") ;
        output.addAll(left) ;
        output.addAll(right) ;
        return output;
    }
    public static void main(String[] args) {

        TreeNode root =  new TreeNode(1) ;
        root.left = new TreeNode(2) ;
        root.right = new TreeNode(3) ;
        root.left.right = new TreeNode(5) ;

        System.out.println(findPaths(root, ""));



    }

}
