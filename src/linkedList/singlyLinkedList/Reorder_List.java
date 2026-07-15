package linkedList.singlyLinkedList;

public class Reorder_List {

    public class Node{

        int data ;
        Node next ;

        public Node(int value){

            data = value ;

        }
    }

    private Node head ;
    private int size ;

    public Reorder_List(){

        this.size = 0 ;
    }

    public void  Insert_AtHead(int value){

        Node tempNode = new Node(value) ;

        tempNode.next = head;
        head = tempNode ;

    }

    public Node Reorder_List(){

        if(head == null){
            return null ;


        }
        Node start = head ;
        Node end = head ;

        while(start!=null && end!=null){

            start = start.next ;
            end = end.next.next ;
        }

//        Now to reverse the List we need to make a newNode

        Node temp = start;
        Node prev = null ;

        while(temp!=null){

            Node curren = temp.next ;

            temp.next = prev ;
            prev = temp ;

            temp = curren ;

        }




        return null ;


    }





}
