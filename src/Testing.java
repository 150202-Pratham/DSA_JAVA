public class Testing {


    public static void main(String[] args) {

        String s1 = "Hello World" ;
        StringBuilder s3 = new StringBuilder();
        for(String a : s1.split(" "))
            s3.append(new StringBuilder(a).reverse()+" ");


         System.out.println(s3.toString().trim());

    }
}
