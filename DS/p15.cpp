#include <iostream>
using namespace std;

int main() {
    int a[] = {8, 4, 23, 42, 16, 15};
    int n = 6;

    for (int i = 1; i < n; i++) {
        int key = a[i], j = i - 1;

        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j--;
        }

        a[j + 1] = key;
    }

    for (int i = 0; i < n; i++)
        cout << a[i] << " ";

    return 0;
}