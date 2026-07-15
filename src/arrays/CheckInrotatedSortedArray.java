package arrays;

public class CheckInrotatedSortedArray {
    public static boolean check_rotated_Sorted(int arr[]){
        int setCondition = 0 ;

        for(int i = 0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[(i+1)%arr.length]){
                setCondition+=1 ;


            }

        }


        if(setCondition<=1){
            return true ;

        }

        return false ;


    }
    public static void main(String args[]){
        int []arr = {2,1,3,4} ;

       System.out.print(check_rotated_Sorted(arr)) ;


    }
}
