package AdvancedRecursion.Trees.BinarySearchTrees.TreeDB.index;

public class BinarySearchTree<K extends Comparable<K> , V> {

    private Node<K,V> root ;

    private int size(Node<K,V> node){
        return node == null ? 0 : node.size ;

    }

    private boolean isEmpty(){

        return root==null ;
    }

    private void updateSize(Node<K,V> node){
        if(node !=null){
            node.size = 1 + size(node.left)+ size(node.right);

        }
    }

    public void put(K key , V value){
        if(key == null)
//            Throw Exception ;



        root = put(root , key , value);

    }

    public Node<K,V> put(Node<K, V> node , K key , V value){

        if(node == null){
            return new Node<>(key , value) ;
        }

        int comparison ;

        return null ;

    }


}
