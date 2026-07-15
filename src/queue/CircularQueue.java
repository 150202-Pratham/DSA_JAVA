package queue;

public class CircularQueue {
    int queue[];
    int size;
    int front;
    int rear;

    CircularQueue(){
        this(5);
    }

    CircularQueue(int size){
        this.size = size;
        queue = new int[size];

        front = -1;
        rear = -1;
    }

    boolean isEmpty(){
        return front==-1;
    }

    boolean isFull(){
        return (rear + 1) % size == front;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        return queue[front];
    }

    void enqueue(int item){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }

        if(front==-1 && rear==-1){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear + 1) % size;
        }

        queue[rear] = item;
    }


    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int deletedItem = queue[front];

        if(front==rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1) % size;
        }

        return deletedItem;
    }


    void traversal(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        int i=front;

        do{
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }while(i != (rear + 1) % size);

        System.out.println();
    }
}
