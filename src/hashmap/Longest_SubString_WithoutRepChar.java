package hashmap;

public class Longest_SubString_WithoutRepChar {

    public static void longest_Common_Substring(String new_2){
        for(int i = 0 ; i<new_2.length() ; i++ ){

            StringBuilder sb = new StringBuilder() ;

            for(int j = i ; j<new_2.length() ; j++){
                sb.append(new_2.charAt(j)) ;
                System.out.println(sb.toString()) ;

            }
        }

//        but here one thing is happening is that same character is Getting repeated only How
//        we need to Stop this
        




    }

    public static void main(String []args){
        String a_new = "cadbzabcd" ;

        longest_Common_Substring(a_new) ;

    }

}
