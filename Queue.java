public class Queue {
     int[] arr;     // Array to store queue elements
     int front;     // Points to the front of the queue
     int rear;      // Points to the rear of the queue
     int size;      // Current size of the queue
     int capacity;  // Maximum capacity of the queue

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue operation: Add an element to the rear of the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        arr[rear] = value;
        size++;
    }

    // Dequeue operation: Remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Indicate error
        }
        int value = arr[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return value;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the size of the queue
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());

        queue.enqueue(60);
        queue.enqueue(70);

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }
    }
}
