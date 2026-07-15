package arrays;

public class Subarray_SizeK_AverageGreater_ThanTheshHold {

    public static int count_Number_Arrays(int []arr , int k , int holder){

        int l = 0 , r = k-1 , sum = 0 ;
        int count = 0 ;

        for(int i = l ; i<=r ; i++){
            sum+=arr[i] ;
        }
        if((sum/k)>=holder){
            count+=1 ;


        }
        while(r<arr.length-1){




            sum-=arr[l] ;
            l+=1 ;
            r+=1 ;
            sum+=arr[r] ;

            if((sum/k)>=holder){
                count+=1 ;


            }
        }

        return  count  ;


    }


    public static void main(String []args){

        int []arr = {2,2,2,2,5,5,5,8} ;

        int k = 3 ;

        int holder = 4 ;

        System.out.println(count_Number_Arrays(arr , k , holder)) ;


    }
}
