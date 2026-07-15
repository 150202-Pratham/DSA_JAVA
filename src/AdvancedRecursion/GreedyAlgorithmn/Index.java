package AdvancedRecursion.GreedyAlgorithmn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Index {
//    learning the implementation of Comparator and comparable ;

    public static void main(String []args){

        List<Employee> list = new ArrayList<>() ;

        list.add(new Employee("Shubhneet" , 1535 ,  5000000));
        list.add(new Employee("Shivi" , 1522 , 4000000));
        list.add(new Employee("Shubham" ,1533 , 4500000));
        list.add(new Employee("Sandeep" , 1511 , 3800000));

        Collections.sort(list); ;

        System.out.println(list);


    }
}
