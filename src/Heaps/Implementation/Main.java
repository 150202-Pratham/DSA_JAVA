package Heaps.Implementation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        Implement_Heaps<Integer> heap = new Implement_Heaps<>() ;

        heap.insert(34) ;
        heap.insert(45) ;
        heap.insert(22);
        heap.insert(89) ;
        heap.insert(76) ;
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
        ArrayList list  = heap.heapSort() ;
        System.out.println(list) ;


    }
}
