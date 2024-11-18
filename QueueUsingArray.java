  // Ass.1(que.26) //

import java.util.Scanner;

public class QueueUsingArray {
    private int[] queue;
    private int front, rear, capacity, size;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow! Unable to enqueue " + value);
        } else {
            rear = (rear + 1) % capacity; // Circular increment
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued to queue");
        }
    }

    public void dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow! The queue is empty.");
        } else {
            int dequeuedValue = queue[front];
            front = (front + 1) % capacity; 
            size--;
            System.out.println(dequeuedValue + " dequeued from queue");
        }
    }

    public void peek() {
        if (size == 0) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Front element is: " + queue[front]);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            for (int j = 0; j < size; j++) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % capacity; 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the queue: ");
        int capacity = scanner.nextInt();

        QueueUsingArray queue = new QueueUsingArray(capacity);

        while (true) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Check if queue is empty");
            System.out.println("6. Check if queue is full");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Queue is not empty.");
                    }
                    break;
                case 6:
                    if (queue.isFull()) {
                        System.out.println("Queue is full.");
                    } else {
        
