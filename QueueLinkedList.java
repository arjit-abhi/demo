public class QueueLinkedList {
    // Node class to represent each element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front; 
    private Node rear;  
    private int size;  

    // Constructor to initialize the queue
    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Enqueue operation
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) { // If the queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1; // Indicate error
        }
        int value = front.data;
        front = front.next;
        if (front == null) { // If the queue becomes empty
            rear = null;
        }
        size--;
        return value;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get the size of queue
    public int getSize() {
        return size;
    }

    // Peek operation: Get front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1; 
        }
        return front.data;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Front element: " + queue.peek()); 
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue()); 
        System.out.println("Queue size: " + queue.getSize()); 
    }
}
