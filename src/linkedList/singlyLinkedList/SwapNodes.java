package linkedList.singlyLinkedList;

public class SwapNodes {
    private  Node head ;
    private Node tail ;
    public int size  ;

    public class Node{
        int value ;
        Node next ;

        public Node(int value){

            this.value = value ;


        }
    }

    public SwapNodes(){

        this.size = 0 ;

    }

    public void  insertAtHead(int value ){
        Node temp = new Node(value) ;
        temp.next = head ;
        head = temp ;

        if(tail==null){

            tail = head ;

        }


    }

    public void insertAtTail(int value){

        if(head==null){
            insertAtHead(value) ;

        }

        Node temp_tail = new Node(value) ;
        tail.next = temp_tail;
        tail = temp_tail ;



    }

    public Node swapNode(int k){
        Node temp = head ;
        int n = 0 ;

        while(temp!=null){
            n++ ;
            temp = temp.next ;

        }


        Node firstTemp = head ;
        for(int i = 1 ; i<k; i++){
            firstTemp = firstTemp.next;


        }

        Node secondTemp = head ;

        for(int  i = 1 ; i<n-k+1 ; i++){

            secondTemp = secondTemp.next ;

        }

        int temp_value = firstTemp.value ;
        firstTemp.value = secondTemp.value ;
        secondTemp.value = temp_value ;


        return head ;



    }

    public void display(){
        Node temp = head ;

        while(temp!=null){
            System.out.print("->"+temp.value);
            temp = temp.next ;


        }

        System.out.println(" ") ;




    }

    public static void main(String []args){

        SwapNodes obj = new SwapNodes() ;

        obj.insertAtTail(10);
        obj.insertAtTail(20);
        obj.insertAtTail(30);
        obj.insertAtTail(40);

        obj.display() ;

        obj.swapNode(2) ;

        obj.display() ;

    }



}
