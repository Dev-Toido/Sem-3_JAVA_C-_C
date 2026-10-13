#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> graph(5, vector<int>(5, 0));

void addEdge(int u, int v) {
    graph[u-1][v-1] = graph[v-1][u-1] = 1;
}

void removeEdge(int u, int v) {
    graph[u-1][v-1] = graph[v-1][u-1] = 0;
}

void addVertex() {
    int n = graph.size();
    for (auto &row : graph)
        row.push_back(0);
    graph.push_back(vector<int>(n + 1, 0));
}

void removeVertex(int v) {
    graph.erase(graph.begin() + v - 1);
    for (auto &row : graph)
        row.erase(row.begin() + v - 1);
}

void display() {
    cout << "\nAdjacency Matrix:\n";
    for (auto row : graph) {
        for (int x : row)
            cout << x << " ";
        cout << endl;
    }
}

int main() {
    addEdge(1, 2);
    addEdge(1, 3);
    addEdge(1, 4);
    addEdge(2, 4);
    addEdge(2, 5);
    addEdge(3, 4);
    addEdge(3, 5);
    addEdge(4, 5);

    int choice, u, v;

    do {
        cout << "\n1. Display Graph\n2. Add Edge\n3. Remove Edge";
        cout << "\n4. Add Vertex\n5. Remove Vertex\n0. Exit\n";
        cin >> choice;

        switch (choice) {
            case 1:
                display();
                break;
            case 2:
                cin >> u >> v;
                addEdge(u, v);
                break;
            case 3:
                cin >> u >> v;
                removeEdge(u, v);
                break;
            case 4:
                addVertex();
                break;
            case 5:
                cin >> v;
                removeVertex(v);
                break;
        }
    } while (choice != 0);

    return 0;
}