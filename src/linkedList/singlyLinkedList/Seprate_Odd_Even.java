package linkedList.singlyLinkedList;

public class Seprate_Odd_Even {
    private Node head ;
    private Node tail ;
    private int size ;

    public Seprate_Odd_Even(){
        this.size  = 0 ;


    }

    public void insertAtHead(int value){

        Node newNode = new Node(value) ;

        newNode.next = head ;

        head = newNode ;

        if(tail==null){

            tail = newNode ;
        }

        size++ ;


    }

    public void insertAtTail(int value){

        if(tail==null){

            insertAtHead(value) ;

        }
        Node newNode = new Node(value) ;
        newNode.next = tail ;
        tail = newNode ;

        size++ ;




    }
    public class Node{

        public int data ;
        public Node next ;

        public Node(int value){

            this.data = value ;


        }
    }

    public void display(){

        Node temp = head ;
        while(temp!=null){

            System.out.print(temp.data) ;

            temp = temp.next  ;
            System.out.print("->") ;
        }

    }

    public void Odd_Even(){

        Node odd = head ;
        Node even = head.next ;

        Node evenNode = head.next ;

        while(even!=null && even.next!=null){

            odd.next = odd.next.next ;
            even.next = even.next.next ;

            odd = odd.next ;
            even = even.next ;


        }

        odd.next = evenNode ;



    }

    public static void main(String args[]){

        Seprate_Odd_Even list = new Seprate_Odd_Even() ;

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        list.insertAtHead(50);
        list.insertAtHead(60);


        list.display() ;

        System.out.println(" ") ;



//        now wwe will just seprate the linked list

        list.Odd_Even();

        list.display() ;









    }
}
