import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int arr[]){

        for(int  i = 0 ; i<arr.length ; i++) {

           int maxInd = 0;

            for (int j = 0 ; j<arr.length-i ; j++){
                if(arr[maxInd] < arr[j]){
                    maxInd = j ;

                }
            }

            int temp = arr[maxInd] ;

            arr[maxInd] = arr[arr.length-i-1] ;

            arr[arr.length-i-1] = temp ;

         }

    }



    public static void main(String[] args) {

        int arr[] = {64 , 25 , 12 , 22, 11} ;


        selectionSort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
