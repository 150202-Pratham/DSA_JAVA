package linkedList.singlyLinkedList;

public class Implementation_Main {

    public static void main(String []args){

        Implementation mylist = new Implementation() ;

        mylist.insertAtHead(10);
        mylist.insertAtHead(20);
        mylist.insertAtHead(30);

        mylist.insertAtTail(40);
        mylist.insertAtTail(50);
        mylist.insertAtTail(60);

        System.out.println(mylist.linearSearch(50)) ;


    }


}
