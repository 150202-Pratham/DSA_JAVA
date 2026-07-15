package queue;

public class Main {
    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.traversal();

        queue.dequeue();
        queue.traversal();

        queue.enqueue(60);
        queue.traversal();

    }
}
