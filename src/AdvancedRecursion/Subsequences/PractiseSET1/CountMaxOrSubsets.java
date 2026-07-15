package AdvancedRecursion.Subsequences.PractiseSET1;

public class CountMaxOrSubsets {
   public static int checkMaxOrOperations(int []nums ,int index , int maxOR, int currentOR){
       if(index==nums.length){
           if(maxOR==currentOR){
               return 1 ;

           }
           return 0 ;
       }
       int count = 0 ;

       count+= checkMaxOrOperations(nums , index +1 , maxOR, currentOR|nums[index]);
       count+= checkMaxOrOperations(nums , index +1 , maxOR, currentOR);

       return count ;

   }
    public static void main(String[] args) {
        int []nums = {3,1} ;
        int maxOR = 0 ;
        int count = 0 ;
        for(int num:nums){
            maxOR = maxOR|num ;
        }

        System.out.println( checkMaxOrOperations(nums,0,maxOR, 0)) ;



    }
}
