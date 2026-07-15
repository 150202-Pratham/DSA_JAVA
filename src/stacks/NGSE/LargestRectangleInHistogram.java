package stacks.NGSE;


import java.util.Stack;

public class LargestRectangleInHistogram {

    public static int largestRectangle(int []height){
        int []width = new int[height.length] ;
        int []nsr = new int [height.length] ;
        int  []nsl = new int [height.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i<height.length ; i++){

            while(!st.isEmpty() && height[i]<height[st.peek()]){
                st.pop() ;
            }
            if(st.isEmpty()){
                nsl[i] = -1 ;

            }

            else {
                nsl[i] = st.peek() ;
            }

            st.push(i);


        }

        st.clear();

        for(int i = height.length-1 ; i>=0 ; i--){
            while(!st.isEmpty() && height[st.peek()]>height[i]){
                st.pop() ;

            }
            if(st.isEmpty()){
                nsr[i] = -1 ;

            }
            else{
                nsr[i] = st.peek() ;
            }

            st.push(i) ;

        }
        int j = 0 , k = nsr.length-1 ;
        while(j<k){
            int temp = nsr[k] ;
            nsr[k] = nsr[j] ;
            nsr[j] = temp ;
            j++;
            k--;

        }

        for(int i = 0 ; i<height.length ; i++){
            width[i] = nsr[i]-nsl[i]-1 ;
            
        }

        return 0;


    }
    public static void main(String[] args) {

        int []arr = {2,1,5,6,2,3} ;
        System.out.println(largestRectangle(arr));


    }


}
