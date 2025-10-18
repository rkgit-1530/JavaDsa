class Circular {
    int[] queue;
    int front, rear, size, capacity;

    Circular(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    void enqueue(int data) {
        if(size == capacity) {
            System.out.println("Queue is Full!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
        System.out.println(data + " added to queue");
    }

    // Dequeue
    void dequeue() {
        if(size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println(queue[front] + " removed from queue");
        front = (front + 1) % capacity;
        size--;
    }

    // Peek front element
    void peek() {
        if(size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.println("Front element: " + queue[front]);
    }

    // Display queue
    void display() {
        if(size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue: ");
        for(int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        Circular q = new Circular(3);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(40);
        q.enqueue(80);
        q.enqueue(50);
        q.enqueue(60); // wraps around
        q.display();
        q.peek();
    }
}
