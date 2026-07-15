package UCA.Greedy;

public class LemondeChange {

    public static boolean lemonadeChange(int []arr){
        int $5 = 0;
        int $10 = 0 ;

        for(int i = 0 ; i<arr.length ; i++){

            if(arr[i]==5){
                $5+=1;
            }
            else if(arr[i]==10){
                if($5>=1){
                    $5-=1;
                }

                $10+=1 ;
            }
            else{

                if($5>=1 && $10>=1){
                    $5-=1;
                    $10-=1 ;
                }

                else if($5>=3){
                    $5-=3;
                }
                else {
                    return false ;
                }
            }


        }

        return true ;
    }
    public static void main(String[] args) {
        int []arr = {5,5,10,10,20};
        System.out.println(lemonadeChange(arr));

    }

}
