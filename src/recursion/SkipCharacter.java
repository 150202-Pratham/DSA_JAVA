package recursion;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class SkipCharacter {

    public static String removeCharacter(String str , char skip){
        if(str.isEmpty()){
            return "" ;

        }

        if(str.charAt(0)==skip){
            return removeCharacter(str.substring(1) , skip) ;

        }
        else {
            return str.charAt(0)+removeCharacter(str.substring(1) , skip) ;

        }
    }
    public static String removeCharacter(String str , char skip , int ind){

        if(ind==str.length()){
            return "" ;

        }

        if(str.charAt(ind)==skip){
            return removeCharacter(str , skip , ind+1) ;

        }
         else {
           return   str.charAt(ind)+ removeCharacter(str , skip , ind+1);
        }


    }
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(isr);

        String str = br.readLine();
        char skip =  (char) br.read() ;
        String output = removeCharacter(str , skip , 0) ;
        String output1 = removeCharacter(str , skip) ;



        System.out.println(output) ;
        System.out.println("Output1 ---->"+ output1);


    }
}
