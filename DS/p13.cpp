#include <iostream>
#include <queue>
using namespace std;

int graph[7][7] = {
    {0,1,0,1,0,0,0},
    {1,0,1,1,0,1,1},
    {0,1,0,1,1,1,0},
    {1,1,1,0,1,0,0},
    {0,0,1,1,0,0,1},
    {0,1,1,0,0,0,0},
    {0,1,0,0,1,0,0}
};

bool visited[7] = {};

void DFS(int v) {
    cout << v << " ";
    visited[v] = true;

    for (int i = 0; i < 7; i++)
        if (graph[v][i] && !visited[i])
            DFS(i);
}

void BFS(int v) {
    bool seen[7] = {};
    queue<int> q;
    q.push(v);
    seen[v] = true;

    while (!q.empty()) {
        v = q.front();
        q.pop();
        cout << v << " ";

        for (int i = 0; i < 7; i++)
            if (graph[v][i] && !seen[i]) {
                q.push(i);
                seen[i] = true;
            }
    }
}

int main() {
    cout << "DFS: ";
    DFS(0);

    cout << "\nBFS: ";
    BFS(0);

    return 0;
}