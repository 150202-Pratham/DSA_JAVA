package stacks;

public class TrappingRainwater {


    public static void main(String []args) {

        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};


        int[] leftMax = new int[arr.length];   // Se this is also called PrefixMax ;
        int[] rightMax = new int[arr.length];   // see now this is also called as SuffixMax;

        int total = 0;
//      We need to first calculate the leftMax and Right Max as well


        leftMax[0] = arr[0];
        rightMax[arr.length - 1] = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {

            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);

        }

//        Space Complexity = O(n) ;


        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);

        }

//        Space Complexity = O(n)+O(n) = o(2N) ;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < leftMax[i] && arr[i] < rightMax[i]) {

                total += Math.min(leftMax[i], rightMax[i]) - arr[i];

            }

        }

        System.out.println(total);


//        paging , sorting , customvalidation and throw and throws ;

    }

}
