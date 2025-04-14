class IntStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public IntStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    // Push element onto the stack
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stack[++top] = val;
        }
    }

    // Pop element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            return stack[top--];
        }
    }

    // Display from Top to Bottom
    public void displayFromTop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack (Top to Bottom):");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    // Display from Bottom to Top
    public void displayFromBot() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack (Bottom to Top):");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }

    // Return top element
    public int stackTop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    public boolean isFull() {
        return top == capacity - 1;
    }
}
class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node head;

    // Constructor
    public LinkedList() {
        head = null;
    }

    // a) Check if list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // b) Display all elements
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else {
            Node temp = head;
            System.out.print("Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // c) Add at last
    public void addAtLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // d) Delete at head
    public void deleteAtHead() {
        if (isEmpty()) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            head = head.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Test Stack
        IntStack stack = new IntStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.displayFromTop();
        stack.displayFromBot();
        System.out.println("Top Element: " + stack.stackTop());
        stack.pop();
        stack.displayFromTop();
        System.out.println("Is Stack Empty? " + stack.isEmpty());
        System.out.println("Is Stack Full? " + stack.isFull());

        System.out.println("\n--- Linked List Test ---");
        // Test LinkedList
        LinkedList list = new LinkedList();
        list.addAtLast(100);
        list.addAtLast(200);
        list.addAtLast(300);
        list.display();
        list.deleteAtHead();
        list.display();
        System.out.println("Is Linked List Empty? " + list.isEmpty());
    }
}
