package AdvancedRecursion.Trees.BinarySearchTrees.TreeDB.index;

import AdvancedRecursion.Trees.BinarySearchTrees.TreeDB.model.Student;

public class Node<K extends Comparable<K> , V> {
   K key ;
   V value ;

   Node<K,V> left ;
   Node<K,V> right ;

   int size ;


   public Node(K key , V value){
      this.key = key ;
      this.value = value ;

      this.right = null ;
      this.left = null ;

      this.size = 1 ;

   }
}
