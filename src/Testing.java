public class Testing {
   public static void skipCharacter(String str, StringBuilder st , char skip){
       if(str.isEmpty()){
           return ;
       }
       char ch = str.charAt(0) ;
       if(ch==skip){
           skipCharacter(str.substring(1), st, skip) ;
       }
       else{
           skipCharacter(str.substring(1) , st.append(ch) , skip) ;

       }

   }
   public static void skipString(String arr , StringBuilder st , String skipper){

       if(arr.isEmpty()){
           return ;

       }
       if(arr.startsWith(skipper)){
           skipString(arr.substring(skipper.length()) , st , skipper) ;

       }
       else{
           skipString(arr.substring(1) , st.append(arr.charAt(0)) , skipper) ;
       }


   }

    public static void main(String[] args) {

//        String s1 = "Hello World" ;
//        StringBuilder s3 = new StringBuilder();
//        for(String a : s1.split(" "))
//            s3.append(new StringBuilder(a).reverse()+" ");
//
//
//         System.out.println(s3.toString().trim());
//
//        String str = "hello world" ;
//
//        String arr[] = str.split(" ") ;
//
//        StringBuilder sb = new StringBuilder();
//
//        for(String st : arr){
//            sb.append(Character.toUpperCase(st.charAt(0))) ;
//            sb.append(st.substring(1));
//            sb.append(" ") ;
//        }

//        Skip a Particular Character from yhe String
        StringBuilder st = new StringBuilder() ;

        skipCharacter("baccad" , st , 'a') ;

        System.out.println(st.toString());

//        Skip a Particular String Within a String
        StringBuilder st1 = new StringBuilder() ;
        skipString("KiwiAppleOrangeKiwi" , st1 , "Kiwi") ;
        System.out.println(st1.toString());


    }
}
