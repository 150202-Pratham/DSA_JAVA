package UCA.Trees;
import AdvancedRecursion.Trees.BinaryTrees.TreeNode;

import java.util.*;

public class ZigZagTraversal {

    public static List<List<Integer>> zigZagTraversal(TreeNode root){
        if(root==null) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>() ;
        Queue<TreeNode> q = new LinkedList<>() ;
        q.add(root) ;
        boolean reverse = false ;
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>() ;
           int size = q.size() ;
            for(int i = 0 ; i<size ; i++){
                TreeNode node = q.poll() ;
                list.add(node.value) ;

                if(node.left!=null) q.offer(node.left);
                if(node.right!=null) q.offer(node.right) ;

            }

            if(reverse) Collections.reverse(list) ;
            result.add(list) ;
            reverse =  true ;


        }

        return result ;




    }
    public static void main(String []args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9) ;
        root.right = new TreeNode(20) ;
        root.right.left = new TreeNode(15) ;
        root.right.right = new TreeNode(7) ;

        List<List<Integer>> output =  zigZagTraversal(root) ;
        for(List<Integer> e : output){
            System.out.println(e);
        }
    }
}
