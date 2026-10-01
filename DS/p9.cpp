#include <iostream>
using namespace std;

class Node
{
public:
    int data;
    Node *next;

    Node(int value)
    {
        data = value;
        next = NULL;
    }
};

class CircularLinkedList
{
private:
    Node *last;

public:
    CircularLinkedList()
    {
        last = NULL;
    }

    // 1. Insert at beginning
    void insertBeginning(int value)
    {
        Node *newNode = new Node(value);

        if (last == NULL)
        {
            last = newNode;
            newNode->next = last;
        }
        else
        {
            newNode->next = last->next;
            last->next = newNode;
        }

        cout << "Node inserted at beginning.\n";
    }

    // 2. Insert at end
    void insertEnd(int value)
    {
        Node *newNode = new Node(value);

        if (last == NULL)
        {
            last = newNode;
            newNode->next = last;
        }
        else
        {
            newNode->next = last->next;
            last->next = newNode;
            last = newNode;
        }

        cout << "Node inserted at end.\n";
    }

    // 3. Insert after a given value
    void insertAfterValue(int key, int value)
    {
        if (last == NULL)
        {
            cout << "List is empty.\n";
            return;
        }

        Node *temp = last->next;

        do
        {
            if (temp->data == key)
            {
                Node *newNode = new Node(value);

                newNode->next = temp->next;
                temp->next = newNode;

                // If inserted after last node
                if (temp == last)
                    last = newNode;

                cout << "Node inserted after " << key << ".\n";
                return;
            }

            temp = temp->next;

        } while (temp != last->next);

        cout << "Value " << key << " not found.\n";
    }

    // 4. Delete a node by value
    void deleteByValue(int key)
    {
        if (last == NULL)
        {
            cout << "List is empty.\n";
            return;
        }

        Node *current = last->next;
        Node *previous = last;

        do
        {
            if (current->data == key)
            {
                // Only one node
                if (current == last && current->next == last)
                {
                    last = NULL;
                }
                else
                {
                    previous->next = current->next;

                    // If deleting last node
                    if (current == last)
                        last = previous;
                }

                delete current;

                cout << "Node " << key << " deleted.\n";
                return;
            }

            previous = current;
            current = current->next;

        } while (current != last->next);

        cout << "Value " << key << " not found.\n";
    }

    // 5. Search for a value
    void search(int key)
    {
        if (last == NULL)
        {
            cout << "List is empty.\n";
            return;
        }

        Node *temp = last->next;
        int position = 1;

        do
        {
            if (temp->data == key)
            {
                cout << "Value " << key
                     << " found at position " << position << ".\n";
                return;
            }

            temp = temp->next;
            position++;

        } while (temp != last->next);

        cout << "Value " << key << " not found.\n";
    }

    // 6. Display entire list
    void display()
    {
        if (last == NULL)
        {
            cout << "List is empty.\n";
            return;
        }

        Node *temp = last->next;

        cout << "Circular Linked List: ";

        do
        {
            cout << temp->data << " -> ";
            temp = temp->next;

        } while (temp != last->next);

        cout << "(back to head)\n";
    }
};

int main()
{
    CircularLinkedList list;
    int choice, value, key;

    do
    {
        cout << "\n========== CIRCULAR LINKED LIST ==========\n";
        cout << "1. Insert at beginning\n";
        cout << "2. Insert at end\n";
        cout << "3. Insert after a given value\n";
        cout << "4. Delete a node by value\n";
        cout << "5. Search for a value\n";
        cout << "6. Display the entire list\n";
        cout << "7. Exit\n";
        cout << "===========================================\n";

        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice)
        {
        case 1:
            cout << "Enter value: ";
            cin >> value;
            list.insertBeginning(value);
            break;

        case 2:
            cout << "Enter value: ";
            cin >> value;
            list.insertEnd(value);
            break;

        case 3:
            cout << "Enter value after which to insert: ";
            cin >> key;

            cout << "Enter new value: ";
            cin >> value;

            list.insertAfterValue(key, value);
            break;

        case 4:
            cout << "Enter value to delete: ";
            cin >> key;
            list.deleteByValue(key);
            break;

        case 5:
            cout << "Enter value to search: ";
            cin >> key;
            list.search(key);
            break;

        case 6:
            list.display();
            break;

        case 7:
            cout << "Exiting program...\n";
            break;

        default:
            cout << "Invalid choice!\n";
        }

    } while (choice != 7);

    return 0;
}