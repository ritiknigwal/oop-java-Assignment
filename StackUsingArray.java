  // Ass.1(que.25)  //

import java.util.Scanner;

public class StackUsingArray {
    private int[] stack;
    private int top;
    private int capacity;

    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; 
    }

    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Unable to push " + value);
        } else {
            stack[++top] = value; 
            System.out.println(value + " pushed to stack");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! The stack is empty.");
        } else {
            int poppedValue = stack[top--];
            System.out.println(poppedValue + " popped from stack");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("The stack is empty.");
        } else {
            System.out.println("Top element is: " + stack[top]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();

        StackUsingArray stack = new StackUsingArray(capacity);

        while (true) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if stack is empty");
            System.out.println("6. Check if stack is full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;
                case 6:
                    if (stack.isFull()) {
                        System.out.println("Stack is full.");
                    } else {
                        System.out.println("Stack is not full.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}