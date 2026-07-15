package linkedList.singlyLinkedList;

public class Reverse_LinkedList {
    public class Node{

        private int data ;
        private Node next ;

        public Node(int value){
            this.data = value ;
            this.next = null ;
        }


    }

    private Node head ;
    private Node tail ;
    private int size ;

   public Reverse_LinkedList(){
      this.size = 0 ;

   }

   void insert_Head(int value){

       Node newNode = new Node(value);

       newNode.next = head ;

       head = newNode ;

       if(tail==null){
           tail = newNode ;
       }

       size++ ;



   }

   void insert_Tail(int value){
       Node newNode = new Node(value) ;

       if(tail==null){
           insert_Head(value) ;

       }
       newNode.next = tail ;
       tail = newNode ;


       size++ ;




   }

   Node reverse_List(){

       Node temp = head ;


       Node prev = null ;

       while(temp!=null){

           Node front = temp.next ;

           temp.next = prev ;

           prev = temp ;
           temp = front  ;

       }


       return prev ;




   }

   void display(){

       Node temp  = head ;

       while(temp!=null){

           System.out.print(temp.data+" ") ;

           temp = temp.next ;

       }
       System.out.println();



   }

    public static void main(String args[]){


       Reverse_LinkedList list = new Reverse_LinkedList();

       list.insert_Head(10);
       list.insert_Head(20);
       list.insert_Head(30);
       list.insert_Head(40);
       list.insert_Head(50);


       list.display();

       list.reverse_List() ;

       list.display();



    }
}
