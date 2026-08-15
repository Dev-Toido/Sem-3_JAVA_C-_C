#include <iostream>
using namespace std;

// Define the maximum size of the queue
#define MAX_SIZE 5

class Queue {
private:
    int queueArray[MAX_SIZE];
    int front;
    int rear;

public:
    // Constructor to initialize the queue
    Queue() {
        front = -1;
        rear = -1;
    }

    // Function to check if the queue is empty
    bool isEmpty() {
        return (front == -1);
    }

    // Function to check if the queue is full
    bool isFull() {
        return (rear == MAX_SIZE - 1);
    }

    // Function to insert an element into the queue (Enqueue)
    void insertElement(int value) {
        if (isFull()) {
            cout << "Queue Overflow! Cannot insert " << value << ".\n";
            return;
        }
        
        // If inserting the first element, update front to 0
        if (isEmpty()) {
            front = 0;
        }
        
        // Increment rear and insert the value
        rear++;
        queueArray[rear] = value;
        cout << "Inserted: " << value << "\n";
    }

    // Function to delete an element from the queue (Dequeue)
    void deleteElement() {
        if (isEmpty()) {
            cout << "Queue Underflow! The queue is already empty.\n";
            return;
        }
        
        cout << "Deleted: " << queueArray[front] << "\n";
        
        // If there was only one element in the queue, reset front and rear
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Otherwise, just move the front pointer forward
            front++;
        }
    }

    // Function to display the elements of the queue
    void displayQueue() {
        if (isEmpty()) {
            cout << "Queue is empty! Nothing to display.\n";
            return;
        }
        
        cout << "Queue elements: ";
        for (int i = front; i <= rear; i++) {
            cout << queueArray[i] << " ";
        }
        cout << "\n(Front is at index " << front << ", Rear is at index " << rear << ")\n";
    }
};

int main() {
    Queue q;

    cout << "--- Linear Queue Operations (Array Implementation) ---\n\n";

    // 1. Display initially empty queue
    q.displayQueue();
    cout << "\n";

    // 2. Insert elements into the queue
    q.insertElement(10);
    q.insertElement(20);
    q.insertElement(30);
    q.insertElement(40);
    
    // 3. Display queue after insertions
    q.displayQueue();
    cout << "\n";

    // 4. Insert another element to make it full
    q.insertElement(50);
    
    // 5. Attempt to insert when full (Triggers Overflow)
    q.insertElement(60); 
    cout << "\n";

    // 6. Delete elements from the queue
    q.deleteElement();
    q.deleteElement();
    
    // 7. Display queue after deletions
    q.displayQueue();
    cout << "\n";

    return 0;
}