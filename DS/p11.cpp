#include <stdio.h>
#include <stdlib.h>

// ---------------- GENERAL TREE ----------------

struct GNode {
    int data;
    int childCount;
    struct GNode **child;
};

// Create General Tree Node
struct GNode* createGNode(int data, int childCount) {
    struct GNode *newNode =
        (struct GNode*)malloc(sizeof(struct GNode));

    newNode->data = data;
    newNode->childCount = childCount;

    if (childCount > 0)
        newNode->child =
            (struct GNode**)malloc(childCount * sizeof(struct GNode*));
    else
        newNode->child = NULL;

    return newNode;
}

// ---------------- BINARY TREE ----------------

struct BNode {
    int data;
    struct BNode *left;
    struct BNode *right;
};

// Create Binary Tree Node
struct BNode* createBNode(int data) {
    struct BNode *newNode =
        (struct BNode*)malloc(sizeof(struct BNode));

    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;

    return newNode;
}

// Convert General Tree to Binary Tree
// Left  -> First Child
// Right -> Next Sibling

struct BNode* convert(struct GNode *root) {
    if (root == NULL)
        return NULL;

    struct BNode *bRoot = createBNode(root->data);

    if (root->childCount > 0) {

        // First child becomes left child
        bRoot->left = convert(root->child[0]);

        struct BNode *temp = bRoot->left;

        // Remaining children become right siblings
        for (int i = 1; i < root->childCount; i++) {
            temp->right = convert(root->child[i]);
            temp = temp->right;
        }
    }

    return bRoot;
}

// ---------------- DISPLAY ----------------

void displayGeneralTree() {

    printf("\n");
    printf("            1\n");
    printf("         /  |  \\\n");
    printf("        2   3   4\n");
    printf("       / \\      |\n");
    printf("      5   6     7\n");
}

void displayBinaryTree() {

    printf("\n");
    printf("            1\n");
    printf("           /\n");
    printf("          2\n");
    printf("         / \\\n");
    printf("        5   3\n");
    printf("         \\   \\\n");
    printf("          6   4\n");
    printf("             /\n");
    printf("            7\n");
}

// ---------------- MAIN ----------------

int main() {

    /*
             GENERAL TREE

                 1
              /  |  \
             2   3   4
            / \      |
           5   6     7
    */

    struct GNode *root = createGNode(1, 3);

    root->child[0] = createGNode(2, 2);
    root->child[1] = createGNode(3, 0);
    root->child[2] = createGNode(4, 1);

    root->child[0]->child[0] = createGNode(5, 0);
    root->child[0]->child[1] = createGNode(6, 0);

    root->child[2]->child[0] = createGNode(7, 0);

    // Convert General Tree to Binary Tree
    struct BNode *binaryRoot = convert(root);

    // Display both trees
    printf("========================================\n");
    printf("       GENERAL TREE TO BINARY TREE\n");
    printf("========================================\n");

    printf("\nOriginal General Tree:\n");
    displayGeneralTree();

    printf("\nConverted Binary Tree:\n");
    displayBinaryTree();

    printf("\n========================================\n");

    return 0;
}
