package linkedList.singlyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {
    private Node head ;
    private int size ;


    public class Node{

        int data ;
        Node next ;

        public Node(int value){
            this.data = value ;

        }

    }

    public RemoveDuplicates2(){

        this.size = 0 ;


    }

    public void insertAtHead(int value){

        Node myTemp = new Node( value) ;

        myTemp.next = head ;
        head = myTemp ;

    }

    public void RemoveDuplicate2(){

//        This Programme is not valid for this case and Hence you need to reevaluate the new Method

        if(head==null || head.next == null){

             System.out.println("List is Empty") ;
        }

        Set<Integer> myset = new HashSet<>() ;

        Node temp = head ;
        Node dummy = head ;
        Node current = dummy ;

        while(temp!=null){

            if(myset.contains(temp.data)){

                current.next = temp.next ;
            }
            else{
                myset.add(temp.data) ;
                current = temp.next ;
            }

            temp = temp.next ;


        }

    }

    public void removeSortedDuplicate(){
        if(head==null || head.next == null){
            System.out.println("List is Empty") ;

        }
        Node temp  = head ;

        while(temp!=null){


        }
    }
}
