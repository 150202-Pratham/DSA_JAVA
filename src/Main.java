import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static class Student{
        String name;
        String  rollNo;
        int marks;
    }
    public static class Account extends Student{
        int feesPaid ;
        int dueFees ;
    }
    public static class Grade extends Account{
        static String Grade ;

        public Grade(Scanner sc){

            name = sc.nextLine();
            rollNo = sc.nextLine();
            marks = sc.nextInt();
            feesPaid =  sc.nextInt();
            dueFees = sc.nextInt();


        }
        void setGrade(){
            if(marks>=90){
                Grade = "A" ;
            }
            else if(marks>=80 && marks<=90) Grade  = "A" ;
            else if (marks>=70 && marks<=80) Grade  = "B+" ;
            else if(marks>=60 && marks<=70) Grade  = "B" ;
            else if (marks>=50 && marks<=60) Grade  = "C" ;
            else{
                Grade = "F";
            }

        }

        void display(){
            setGrade() ;

            System.out.println(name + " " + rollNo + " " + marks + " " + Grade + " " + feesPaid + " " + dueFees);

        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in) ;

        Grade og =  new Grade(sc);

        og.display() ;

//        System.out.println(sb.toString().trim());


    }
}