package stacks;

public class CustomStack {

    int stack[];
    int size;
    int ptr = -1 ;

    public CustomStack(){

        this(10);
    }
    public CustomStack(int size){

         this.size = size;
         stack = new int[size];
    }
    public boolean isEmpty(){
        return ptr==-1 ;
    }

    public boolean isFull(){
        return ptr==size-1 ;
    }
    public void push(int value){

        if(isFull()){
            return ;
        }

        ptr+=1 ;

        stack[ptr] = value ;

    }

    public int pop() throws Exception{
        if(isEmpty()){

            throw new Exception("Stack is Empty") ;
        }

        int removedItem = stack[ptr] ;

        ptr-- ;

        return removedItem ;

    }

    public int peek() throws Exception{

        if(isEmpty()){

            throw new Exception("Stack is Empty") ;

        }

        return stack[ptr] ;
    }

//     we will always start here from the ptr as if we start iterating from the length we are unknown about
//    the size or how nmany elemnts exist in the array


    public void tansversal(){

        for(int i = ptr ; i>=0 ; i--){

            System.out.print(stack[i]) ;

        }
        System.out.print(" ");

    }



}
