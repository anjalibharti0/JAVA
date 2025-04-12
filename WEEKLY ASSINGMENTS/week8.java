package JAVA.WEEKLY ASSINGMENTS;

// sign a stack class. Provide your own stack exceptions namely push exception and pop exception, 
// which throw exceptions when the stack is full and when the stack is empty respectively. Show the 
// usage of these exceptions in handling a stack object in the main.


// Custom Exception for Stack Overflow
class PushException extends Exception {
    public PushException(String message) {
        super(message);
    }
}

// Custom Exception for Stack Underflow
class PopException extends Exception {
    public PopException(String message) {
        super(message);
    }
}

// Stack class
class MyStack {
    int[] stack;
    int top;
    int size;

    // Constructor
    public MyStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1; // stack is initially empty
    }

    // Push method
    public void push(int value) throws PushException {
        if (top == size - 1) {
            throw new PushException("Stack Overflow! Cannot push: " + value);
        }
        stack[++top] = value;
    }

    // Pop method
    public int pop() throws PopException {
        if (top == -1) {
            throw new PopException("Stack Underflow! Cannot pop from empty stack.");
        }
        return stack[top--];
    }

    // Display method
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

// Main class to test
public class CustomStackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3); // Stack of size 3

        try {
            // Pushing elements
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.display();

            // This will throw PushException
            stack.push(40);

        } catch (PushException e) {
            System.out.println("Push Error: " + e.getMessage());
        }

        try {
            // Popping all elements
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());
            System.out.println("Popped: " + stack.pop());

            // This will throw PopException
            System.out.println("Popped: " + stack.pop());

        } catch (PopException e) {
            System.out.println("Pop Error: " + e.getMessage());
        }
    }
}

