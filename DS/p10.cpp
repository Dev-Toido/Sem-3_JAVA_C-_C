#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;

    Node(int value) {
        data = value;
        left = NULL;
        right = NULL;
    }
};

int main() {
    // Creating the binary tree
    Node* root = new Node(10);

    root->left = new Node(11);
    root->right = new Node(9);

    root->left->left = new Node(7);
    root->left->right = new Node(12);

    root->right->left = new Node(15);
    root->right->right = new Node(8);

    // Printing the tree
    cout << "           " << root->data << endl;
    cout << "         /    \\" << endl;
    cout << "       " << root->left->data << "      " << root->right->data << endl;
    cout << "      /  \\    / \\" << endl;
    cout << "     " << root->left->left->data << "   "
         << root->left->right->data << "  "
         << root->right->left->data << "  "
         << root->right->right->data << endl;

    return 0;
}