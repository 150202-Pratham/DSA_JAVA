package leetcodeStreak;

public class DivisibleNonDivisibleIntegers {

    public static void main(String []args){

        int m =  1 ;
        int n = 5 ;
        int num1 = 0 , num2 = 0  ;

        for(int i = 1 ;i<=n ; i++){

            if(i%m==0){
                num2+=i ;

            }
            else{
                num1+=i ;

            }
        }


        System.out.println(num1-num2);

    }
}
