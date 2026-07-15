package AdvancedRecursion.GreedyAlgorithmn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IndexComparator{

    public static List<Employee> listOut  = new ArrayList<>() ;

    public static void main(String[] args) {
        listOut.add(new Employee("Pratham" , 1480 , 4000000)) ;
        listOut.add(new Employee("Prathik" , 1482 , 3000000));
        listOut.add(new Employee("Priyal"  ,1492 , 8500000)) ;

        Collections.sort(listOut , new Comparator<Employee>(){
            @Override
            public int compare(Employee emp1 , Employee Emp2) {
                return Double.compare(emp1.salary , Emp2.salary) ;
            }
        }) ;

        System.out.println(listOut);





    }

}
