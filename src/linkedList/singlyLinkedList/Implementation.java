package linkedList.singlyLinkedList;

public class Implementation {
    private Node head ;
    private Node tail ;
    private int size ;

    public Implementation() {

        this.size = 0 ;

    }
    public class Node{
        private int data ;
        private Node next ;

        public Node(int value){
            this.data = value ;
        }
        public Node(int value ,Node next){
            this.data = value ;
            this.next = next ;
        }


    }


    public void insertAtHead(int value){

        Node mynode = new Node(value) ;
        mynode.next = head ;
        head = mynode ;

        if(tail==null){
            tail = mynode ;
        }

        size++ ;

    }

    public Node deleteAtHead(){
//        int value = head.value;
//            head = head.next;
//            if(head==null){
//                tail=null;
//            }
//            size--;
//            return value;
        Node temp = head;
        if (head==null) temp=null;
        head = temp.next;
        temp.next = null;
        size--;
        return temp;
    }

    public Node deleteAtTail(){
        Node temp = head;
        while (temp.next!=tail){
            temp = temp.next;
        }
        Node removedNode = temp.next;
        tail = temp;
        tail.next = null;
        size--;
        return removedNode;
    }

    public Node deleteAtIndex(int index)
    {

        if(index == 0){
            return deleteAtHead() ;

        }
        if(index == size-1){
            return deleteAtTail() ;

        }

        Node temp = head ;



        

        return head;



    }
    public void insertAtTail(int value){

        Node mynode = new Node(value)  ;
        if(tail==null){
            insertAtHead(value) ;


        }
        tail.next = mynode ;
        tail = mynode ;

        size++ ;



    }
    public Node linearSearch(int target){

        Node temp = head ;

        while(temp!=null){

            if(temp.data == target){
                return temp ;

            }

            temp = temp.next ;

        }


        return null ;

    }
}
