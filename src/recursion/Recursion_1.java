package recursion;

import org.w3c.dom.ls.LSOutput;

public class Recursion_1 {

     static void party_1(){
        System.out.println("Welcome1") ;
        party_2() ;

    }
    static void party_2(){
        System.out.println("Welcome2");
        party_3();
    }
    static void party_3(){
         System.out.println("Welcome3");
    }
    public static void main(String args[]){

         party_1();
    }
}
