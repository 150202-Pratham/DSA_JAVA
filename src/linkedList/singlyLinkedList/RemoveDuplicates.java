package linkedList.singlyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    private ListNode head ;
    private int size ;

    public class ListNode{
        int value ;
        ListNode next ;

        public ListNode(int data){
            this.value = data ;

        }

    }

    public RemoveDuplicates(){
        this.size = 0 ;

    }

    public  void insertAtHead(int value){

        ListNode myNode = new ListNode(value) ;
        myNode.next = head ;

        head = myNode ;

        size++ ;


    }

    public void removeDuplicate(){

        if(head == null || head.next == null){
            System.out.println("List is empty");

        }

        Map<Integer,Integer> myMap = new HashMap<>() ;

        ListNode temp = head ;

        while(temp!=null){

            myMap.put(temp.value , myMap.getOrDefault(temp.value , 0)+1 ) ;

            temp = temp.next ;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        ListNode secTemp = head ;

        while(secTemp!=null){

            if(myMap.get(secTemp.value ) == 1){
                current.next = new ListNode(secTemp.value);
                current = current.next;

            }

            secTemp = secTemp.next ;

        }
        

    }


    public void display(){

        ListNode temp = head ;

        while(temp!=null){

            System.out.print(temp.value + " ") ;
            temp = temp.next ;
        }
        System.out.println();


    }


    public static void main(String args[]){

        RemoveDuplicates obj = new RemoveDuplicates();
        obj.insertAtHead(2);
        obj.insertAtHead(1);
        obj.insertAtHead(1);
//        obj.insertAtHead(1);
//        obj.insertAtHead(1);

        System.out.println("Before Removing Duplicates ______");
        obj.display();

        obj.removeDuplicate();
        System.out.println("After Removing Duplicates ______");
        obj.display();
    }

}
