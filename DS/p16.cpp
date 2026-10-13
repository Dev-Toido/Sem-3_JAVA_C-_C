#include <iostream>
using namespace std;

void merge(int a[], int l, int m, int r) {
    int b[10], i = l, j = m + 1, k = 0;

    while (i <= m && j <= r)
        b[k++] = (a[i] < a[j]) ? a[i++] : a[j++];

    while (i <= m) b[k++] = a[i++];
    while (j <= r) b[k++] = a[j++];

    for (i = l, k = 0; i <= r; i++)
        a[i] = b[k++];
}

void mergeSort(int a[], int l, int r) {
    if (l < r) {
        int m = (l + r) / 2;
        mergeSort(a, l, m);
        mergeSort(a, m + 1, r);
        merge(a, l, m, r);
    }
}

int main() {
    int a[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

    mergeSort(a, 0, 9);

    for (int i = 0; i < 10; i++)
        cout << a[i] << " ";

    return 0;
}