package arrays.TwoPointer_SlidingWindow.dynamicwindow;

public class AlternatingGroups1 {
    public  static int numberOfAlternatingGroups(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int a = arr[i % n];
            int b = arr[(i + 1) % n];
            int c = arr[(i + 2) % n];

            if (a == c && b != a) {
                count++;
            }
        }

        return count;





    }
    public static void main(String[] args) {

        int []arr = {0,1,0,0,1} ;

        System.out.println(numberOfAlternatingGroups(arr));

    }
}
