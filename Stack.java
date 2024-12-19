public class Stack {
    private final int maxSize;      // Maximum size of the stack
    private final int[] stackArray; // Array to store stack elements
    private int top;          // Index of the top element in the stack

    // Constructor to initialize the stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; // Stack is initially empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value; // Increment top and insert value
        }
    }

    // Method to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Indicating stack underflow
        } else {
            return stackArray[top--]; // Return value and decrement top
        }
    }

    // Method to view the top element without removing it
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Main method to test the stack
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Creating a stack of size 5

        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Displaying the top element 
        System.out.println("Top element is: " + stack.top());

        // Popping elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
