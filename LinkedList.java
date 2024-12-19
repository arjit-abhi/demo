class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    // Push operation:
    public static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Link the new node to the current head
        return newNode;      // Return the new node as the new head
    }

    // Pop operation: 
    public static Node pop(Node head) {
        if (head == null) {
            System.err.println("Stack is empty! Cannot pop.");
            return null;
        }
        System.out.println("Popped: " + head.data);
        return head.next; // Move head to the next node
    }

    // Peek operation: Returns the value of the top element
    public static void peek(Node head) {
        if (head == null) {
            System.err.println("Stack is empty! Nothing to peek.");
        } else {
            System.out.println("Peek: " + head.data);
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.err.println("Data: " + temp.data + " ->, Address: " + temp.hashCode());
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {    
        
        /*Node node1 = new Node(15);
        Node node2 = new Node(27);
        Node node3 = new Node(55);
        node1.next = node2;
        node2.next = node3;
        display(node1);*/

        Node head = null;

        head = push(head, 15);
        head = push(head, 27);
        head = push(head, 55);

        System.out.println("Stack after pushing 15, 27, 55:");
        display(head);
        peek(head);
        head = pop(head);
        System.out.println("\nStack after popping:");
        display(head);
    }
}
