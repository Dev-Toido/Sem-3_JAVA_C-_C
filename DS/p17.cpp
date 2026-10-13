#include <iostream>
using namespace std;

const int INF = 999999;
int graph[7][7] = {
    {0, INF, 2, INF, INF, INF, INF},
    {4, 0, INF, INF, INF, INF, INF},
    {INF, INF, 0, INF, INF, INF, INF},
    {INF, 15, INF, 0, 5, INF, 23},
    {INF, 17, INF, INF, 0, INF, 11},
    {INF, INF, 9, INF, INF, 0, 13},
    {INF, INF, INF, INF, INF, INF, 0}
};

int main() {
    char source;
    cout << "Enter source vertex (A-G): ";
    cin >> source;

    int s = source - 'A';
    int dist[7], visited[7] = {};

    for (int i = 0; i < 7; i++)
        dist[i] = INF;

    dist[s] = 0;

    for (int i = 0; i < 7; i++) {
        int u = -1;

        for (int j = 0; j < 7; j++)
            if (!visited[j] && (u == -1 || dist[j] < dist[u]))
                u = j;

        if (u == -1 || dist[u] == INF)
            break;

        visited[u] = 1;

        for (int v = 0; v < 7; v++)
            if (graph[u][v] != INF && dist[u] + graph[u][v] < dist[v])
                dist[v] = dist[u] + graph[u][v];
    }

    for (int i = 0; i < 7; i++) {
        cout << source << " to " << char('A' + i) << ": ";
        if (dist[i] == INF)
            cout << "Unreachable";
        else
            cout << dist[i];
        cout << endl;
    }

    return 0;
}