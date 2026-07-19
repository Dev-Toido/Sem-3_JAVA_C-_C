// AIM: Implement Stack Operations
// Design and implement a Browser History Management System using the Stack data structure
// in C/C++. The program should provide the following operations:
// 1. Visit New Website: Add a new website URL or name to the browser history.
// 2. Back: Remove the most recently visited website from the history and return to the
// previous website.
// 3. Current Website: Display the currently open website without removing it.
// 4. Display History: Show all visited websites from the most recent to the oldest.
// 5. Exit: Terminate the program.

#include <stack>
#include <iostream>
using namespace std;

void printStack(std::stack<string> s)
{
    int co = 0;
    cout << "Sl. No.\t" << "Records" << endl;
    while (!s.empty())
    {
        cout << ++co << "\t" << s.top() << endl;
        s.pop();
    }
}

int main()
{
    stack<string> history;
    int choice;
    string website;
    cout << "Welcome to Browser History Management System!!" << endl;
    do
    {
        cout << "\n\t\t:Menu:" << endl;
        cout << "1. Visit New Website" << endl;
        cout << "2. Back" << endl;
        cout << "3. Current Website" << endl;
        cout << "4. Display History" << endl;
        cout << "5. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;
        switch (choice)
        {
        case 1:
            cout << "Enter the URL/website name to visit: ";
            cin >> website;
            history.push(website);
            break;
        case 2:
            if (history.empty())
            {
                cout << "Already in Home Page!" << endl;
                break;
            }
            cout << "Going back.... Leaving website " << history.top() << endl;
            history.pop();
            break;
        case 3:
            cout << "Currently you are in " << history.top() << endl;
            break;
        case 4:
            cout << "The history goes some what like this: " << endl;
            printStack(history);
            break;
        case 5:
            break;
        default:
            cout << "Wrong input!!" << endl;
            break;
        }
    } while (choice != 5);

    return 0;
}