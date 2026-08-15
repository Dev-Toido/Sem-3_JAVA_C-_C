#include <iostream>
#include <cmath>
using namespace std;

// Recursive function to solve Tower of Hanoi and count moves
void towerOfHanoi(int n, char source, char destination, char helper, int &moveCount) {
    // Base case: If no discs are left to move, return
    if (n == 0) {
        return;
    }
    
    // Step 1: Move n-1 discs from source to helper tower
    towerOfHanoi(n - 1, source, helper, destination, moveCount);
    
    // Step 2: Move the nth (largest) disc from source to destination
    moveCount++;
    cout << "Move disc " << n << " from tower " << source << " to tower " << destination << endl;
    
    // Step 3: Move the n-1 discs from helper to destination tower
    towerOfHanoi(n - 1, helper, destination, source, moveCount);
}

int main() {
    int n;
    cout << "Enter the number of discs: ";
    cin >> n;
    
    int moveCount = 0;
    
    cout << "\nSequence of moves:\n";
    cout << "------------------\n";
    // A = Source, C = Destination, B = Helper
    towerOfHanoi(n, 'A', 'C', 'B', moveCount);
    
    cout << "\n------------------\n";
    cout << "Total moves required (counted): " << moveCount << endl;
    cout << "Maximum possible moves verified by formula (2^n - 1): " << (pow(2, n) - 1) << endl;
    
    return 0;
}