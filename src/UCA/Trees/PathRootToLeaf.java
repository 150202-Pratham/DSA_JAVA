package UCA.Trees;

import AdvancedRecursion.Trees.BinaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathRootToLeaf {

    public static List<List<Integer>> findPath (TreeNode root , List<Integer> store){
        List<List<Integer>> output = new ArrayList<>() ;
        if(root==null) return new ArrayList<>() ;
        store.add(root.value) ;
        if(root.left==null && root.right==null){
            List<List<Integer>> result= new ArrayList<>() ;
            result.add(new ArrayList<>(store)) ;
            store.removeLast();

            return result ;
        }
        output.addAll(findPath(root.left , store));
        output.addAll(findPath(root.right , store));

        store.removeLast() ;
        return output  ;


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(9);

        List<List<Integer>> output =  findPath(root , new ArrayList<>()) ;
        System.out.println(output);
    }
}



