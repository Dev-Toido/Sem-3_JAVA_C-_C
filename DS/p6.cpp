#include <iostream>
using namespace std;

class CircularQueue {
private:
    int *queue;
    int front;
    int rear;
    int capacity;

public:
    // Constructor to initialize the queue with a given size
    CircularQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    // Destructor to free dynamically allocated memory
    ~CircularQueue() {
        delete[] queue;
    }

    // Check if the queue is full
    bool isFull() {
        // The queue is full if the next circular position of rear is front
        return (rear + 1) % capacity == front;
    }

    // Check if the queue is empty
    bool isEmpty() {
        return front == -1;
    }

    // Insert an element into the queue (Enqueue)
    void enqueue(int value) {
        if (isFull()) {
            cout << "Queue Overflow! Cannot enqueue " << value << ". The Circular Queue is full.\n";
            return;
        }
        
        // If inserting the first element
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else {
            // Circular increment of rear
            rear = (rear + 1) % capacity;
        }
        
        queue[rear] = value;
        cout << "Inserted: " << value << " at position " << rear << "\n";
    }

    // Remove an element from the queue (Dequeue)
    void dequeue() {
        if (isEmpty()) {
            cout << "Queue Underflow! The Circular Queue is empty.\n";
            return;
        }
        
        int dequeuedValue = queue[front];
        cout << "Deleted: " << dequeuedValue << " from position " << front << "\n";
        
        // If the queue has only one element, reset to empty state
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Circular increment of front
            front = (front + 1) % capacity;
        }
    }

    // Display all elements in the circular queue
    void display() {
        if (isEmpty()) {
            cout << "Queue is empty!\n";
            return;
        }
        
        cout << "Queue elements: ";
        int i = front;
        while (true) {
            cout << queue[i] << " ";
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity; // Move to the next index circularly
        }
        cout << "\n(Front is at index " << front << ", Rear is at index " << rear << ")\n";
    }
};

int main() {
    int size = 5;
    CircularQueue cq(size);

    cout << "--- Circular Queue Operations ---\n\n";

    // 1. Insert 5 elements (Fills the queue)
    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    cq.enqueue(40);
    cq.enqueue(50);
    cq.display();
    
    cout << "\n";

    // 2. Try to insert when full (Demonstrates Overflow)
    cq.enqueue(60); 

    cout << "\n";

    // 3. Delete 2 elements (Creates empty space at index 0 and 1)
    cq.dequeue();
    cq.dequeue();
    cq.display();

    cout << "\n";

    // 4. Insert elements again (Demonstrates the Circular wrapping behavior)
    cout << "-- Demonstrating Circular Wrapping --\n";
    cq.enqueue(60);
    cq.enqueue(70);
    cq.display();

    return 0;
}