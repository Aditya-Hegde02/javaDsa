package javaDSA;

public class dynamicQueue {
    int items[];
    int front, rear;

    dynamicQueue(int capacity) {
        items = new int[capacity];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    void enQueue(int element) {
        if (rear == items.length - 1) {
            resize(); // increase capacity when full
        }
        if (front == -1)  // first element
            front = 0;
        items[++rear] = element;
        System.out.println("Inserted " + element);
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted " + items[front]);
            front++;
        }
    }

    void resize() {
        int newCapacity = items.length * 2;
        int[] newItems = new int[newCapacity];

        // Copy old elements
        for (int i = front; i <= rear; i++) {
            newItems[i - front] = items[i];
        }

        // Adjust indices
        rear = rear - front;
        front = 0;

        items = newItems;
        System.out.println("Resized queue to capacity " + newCapacity);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("\nFront index -> " + front);
            System.out.print("Items -> ");
            for (int i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index -> " + rear);
        }
    }

    public static void main(String[] args) {
    	dynamicQueue dq = new dynamicQueue(3); // start small

        dq.enQueue(10);
        dq.enQueue(20);
        dq.enQueue(30);
        dq.enQueue(40); // triggers resize
        dq.enQueue(50);

        dq.display();

        dq.deQueue();
        dq.deQueue();

        dq.display();

        dq.enQueue(60);
        dq.enQueue(70);
        dq.enQueue(80); // may trigger another resize

        dq.display();
    }
}
