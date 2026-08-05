package Heaps.Implementation.MergePatterns;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    public static class ListNode{
        int val ;
        ListNode next ;

        public ListNode(int value){
            this.val = value ;

        }
    }
    public static ListNode createList(int[] arr) {

        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }
    public ListNode mergeKLists(ListNode []lists){

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                (a,b)-> Integer.compare(a.val , b.val)

        );

        for(ListNode node : lists){
            if(node!=null){
                pq.offer(node) ;
            }
        }

        ListNode dummy = new ListNode(-1) ;
        ListNode tail = dummy ;

        while(!pq.isEmpty()){

            ListNode curr = pq.poll() ;
            tail.next = curr ;
            tail = tail.next ;

            if(curr.next!=null){
                pq.offer(curr.next) ;

            }

        }

        return dummy.next ;

    }

    public static void printList(ListNode head){

        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        MergeKSortedLists mergeLists = new MergeKSortedLists() ;
        ListNode[] lists = new ListNode[3];

        lists[0] = createList(new int[]{1,4,5});
        lists[1] = createList(new int[]{1,3,4});
        lists[2] = createList(new int[]{2,6});
        ListNode output = mergeLists.mergeKLists(lists);
        printList(output) ;

    }
}
