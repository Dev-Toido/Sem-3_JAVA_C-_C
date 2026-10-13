#include <iostream>
#include <stack>
using namespace std;

struct Node
{
    char data;
    Node *left, *right;

    Node(char x)
    {
        data = x;
        left = right = NULL;
    }
};

void inorder(Node *r)
{
    if (r)
    {
        inorder(r->left);
        cout << r->data << " ";
        inorder(r->right);
    }
}

void preorder(Node *r)
{
    if (r)
    {
        cout << r->data << " ";
        preorder(r->left);
        preorder(r->right);
    }
}

void postorder(Node *r)
{
    if (r)
    {
        postorder(r->left);
        postorder(r->right);
        cout << r->data << " ";
    }
}

void iterativeInorder(Node *r)
{
    stack<Node *> s;
    while (r || !s.empty())
    {
        while (r)
        {
            s.push(r);
            r = r->left;
        }
        r = s.top();
        s.pop();
        cout << r->data << " ";
        r = r->right;
    }
}

void iterativePreorder(Node *r)
{
    if (!r)
        return;
    stack<Node *> s;
    s.push(r);
    while (!s.empty())
    {
        r = s.top();
        s.pop();
        cout << r->data << " ";
        if (r->right)
            s.push(r->right);
        if (r->left)
            s.push(r->left);
    }
}

void iterativePostorder(Node *r)
{
    if (!r)
        return;
    stack<Node *> s1, s2;
    s1.push(r);
    while (!s1.empty())
    {
        r = s1.top();
        s1.pop();
        s2.push(r);
        if (r->left)
            s1.push(r->left);
        if (r->right)
            s1.push(r->right);
    }
    while (!s2.empty())
    {
        cout << s2.top()->data << " ";
        s2.pop();
    }
}

int main()
{
    Node *A = new Node('A');
    A->left = new Node('B');
    A->right = new Node('C');
    A->left->left = new Node('D');
    A->left->right = new Node('E');
    A->left->left->left = new Node('G');
    A->left->left->right = new Node('H');
    A->left->left->right->right = new Node('L');
    A->right->right = new Node('F');
    A->right->right->left = new Node('I');
    A->right->right->right = new Node('J');
    A->right->right->right->left = new Node('K');

    cout << "Recursive Inorder: ";
    inorder(A);
    cout << "\nRecursive Preorder: ";
    preorder(A);
    cout << "\nRecursive Postorder: ";
    postorder(A);

    cout << "\nNonrecursive Inorder: ";
    iterativeInorder(A);
    cout << "\nNonrecursive Preorder: ";
    iterativePreorder(A);
    cout << "\nNonrecursive Postorder: ";
    iterativePostorder(A);

    return 0;
}