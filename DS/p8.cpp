#include <iostream>
using namespace std;

// Define the structure for a Linked List Node
struct Node {
    int data;
    Node* next;

    // Constructor to initialize a new node
    Node(int value) {
        data = value;
        next = nullptr;
    }
};

class SinglyLinkedList {
private:
    Node* head; // Pointer to the first node

public:
    // Constructor to initialize an empty list
    SinglyLinkedList() {
        head = nullptr;
    }

    // 1. Function to insert an element at the end of the list
    void insertElement(int value) {
        Node* newNode = new Node(value);

        // If the list is empty, make the new node the head
        if (head == nullptr) {
            head = newNode;
            cout << "Inserted " << value << " as the first element.\n";
            return;
        }

        // Otherwise, traverse to the last node
        Node* temp = head;
        while (temp->next != nullptr) {
            temp = temp->next;
        }

        // Link the new node at the end
        temp->next = newNode;
        cout << "Inserted " << value << " at the end.\n";
    }

    // 2. Function to delete a specific element by its value
    void deleteElement(int value) {
        // Case 1: List is empty
        if (head == nullptr) {
            cout << "List is empty! Cannot delete.\n";
            return;
        }

        // Case 2: The element to be deleted is the head node
        if (head->data == value) {
            Node* temp = head;
            head = head->next; // Move head to the next node
            delete temp;       // Free memory
            cout << "Deleted " << value << " from the list.\n";
            return;
        }

        // Case 3: The element is somewhere else in the list
        Node* temp = head;
        // Traverse to find the node JUST BEFORE the node to be deleted
        while (temp->next != nullptr && temp->next->data != value) {
            temp = temp->next;
        }

        // If we reached the end and didn't find the value
        if (temp->next == nullptr) {
            cout << "Element " << value << " not found in the list.\n";
            return;
        }

        // Unlink the node and free memory
        Node* nodeToDelete = temp->next;
        temp->next = temp->next->next; // Bypass the node
        delete nodeToDelete;
        cout << "Deleted " << value << " from the list.\n";
    }

    // 3. Function to update a specific element with a new value
    void updateElement(int oldValue, int newValue) {
        if (head == nullptr) {
            cout << "List is empty! Cannot update.\n";
            return;
        }

        Node* temp = head;
        // Traverse the list looking for the oldValue
        while (temp != nullptr) {
            if (temp->data == oldValue) {
                temp->data = newValue; // Update the data
                cout << "Updated " << oldValue << " to " << newValue << ".\n";
                return;
            }
            temp = temp->next;
        }

        // If the loop finishes, the value wasn't found
        cout << "Element " << oldValue << " not found to update.\n";
    }

    // 4. Function to display the linked list
    void displayList() {
        if (head == nullptr) {
            cout << "The list is currently empty.\n";
            return;
        }

        cout << "Linked List: ";
        Node* temp = head;
        while (temp != nullptr) {
            cout << temp->data << " -> ";
            temp = temp->next;
        }
        cout << "NULL\n";
    }
};

int main() {
    SinglyLinkedList list;

    cout << "--- Singly Linked List Operations ---\n\n";

    // 1. Display initial empty list
    list.displayList();
    cout << "\n";

    // 2. Insert elements
    list.insertElement(10);
    list.insertElement(20);
    list.insertElement(30);
    list.insertElement(40);
    
    // Display after insertion
    list.displayList();
    cout << "\n";

    // 3. Update an element
    list.updateElement(20, 25);
    list.displayList();
    cout << "\n";

    // 4. Delete elements
    list.deleteElement(10); // Deleting the head
    list.deleteElement(30); // Deleting a middle element
    
    // Attempting to delete an element not in the list
    list.deleteElement(100); 

    cout << "\n";
    // Display final list
    list.displayList();

    return 0;
}