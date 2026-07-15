package stacks;

import java.util.Stack;

public class SimplifyPath {


        public static String simplifyPath(String path) {
            Stack<String> myStack = new Stack<>() ;

            String []arr = path.split("/") ;

            for(String part : arr){

                if(part.equals("")|| part.equals(".")){
                    continue;

                }
                else if(part.equals("..")){

                    if(!myStack.isEmpty()){
                        myStack.pop() ;

                    }
                }

                else{
                    myStack.push(part) ;

                }
            }


            return "/" + String.join("/", myStack);


        }

    public static void main(String[] args) {

            String str = "/.../a/../b/c/../d/./  " ;
            System.out.println(simplifyPath(str));


    }



}
