package javaDSA;

public class QueueDemo {
    int size = 5;
    int items[] = new int[size];
    int front, rear;

    QueueDemo() {
        front = -1;
        rear = -1;
    }

    boolean isFull() {
        return rear == size - 1;
    }

    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)  // first element
                front = 0;
            rear++;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Deleted " + items[front]);
            front++;
        }
    }
//display the elements of queue
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
        QueueDemo qd = new QueueDemo();
        //adds the elements to the queue
        qd.enQueue(1);
        qd.enQueue(2);
        qd.enQueue(3);
        qd.enQueue(4);
        qd.enQueue(8);
        //cannot add more elements to stack because stack length is 5
        //so it will print Queue is full
        qd.enQueue(8);
        //display all the queue elements
        qd.display();
        //remove elements from queue front
        qd.deQueue();
        qd.deQueue();
        qd.display();
    }
}
