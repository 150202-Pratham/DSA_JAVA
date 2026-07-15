package linkedList.singlyLinkedList;

public class Pallindrome_List {

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

    public Pallindrome_List(){
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

    void display(){

        Node temp  = head ;

        while(temp!=null){

            System.out.print(temp.data+" ") ;

            temp = temp.next ;

        }
        System.out.println();



    }

    boolean isPallindrome(){

        Node temp = head ;
        Node prev = null ;

        while(temp!=null){

            Node front = temp.next ;

            temp.next = prev ;
            prev = temp ;
            temp = front ;

        }

        Node count_prev = prev ;
        Node count_head = head ;

        while(count_head!=null && count_prev!=null){

            if(count_head.data != count_prev.data){
                return false ;


            }
            count_head = count_head.next ;
            count_prev = count_prev.next ;
        }

        return true ;


    }


    public static void main(String args[]){

        Pallindrome_List list = new Pallindrome_List() ;
        list.insert_Head(1) ;
        list.insert_Head(1) ;
        list.insert_Head(2) ;
        list.insert_Head(1) ;

        list.display() ;

//         now to check pallindrome we nned to
        System.out.println(list.isPallindrome()) ;


    }
}
