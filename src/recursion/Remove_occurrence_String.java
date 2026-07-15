package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Remove_occurrence_String {
    public static String skipper(String str , String skip){

        if(str.isEmpty()){
            return "" ;

        }

        if(str.startsWith(skip)){
            return  skipper(str.substring(skip.length()) , skip) ;

        }
        else{
            return str.charAt(0)+ skipper(str.substring(1) , skip) ;

        }
    }
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br =  new BufferedReader(isr);

        String str = br.readLine();

        String skip = br.readLine();

        String output = skipper(str , skip) ;
        System.out.println("the output is ------>" + output);

    }
}
