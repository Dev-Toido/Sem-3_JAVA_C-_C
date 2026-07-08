// You are building a simple inventory system for a warehouse. Products are stored
// in a 2D array Inventory[10][5], where:
// • Rows (i) represent different product categories (0 to 9)
// • Columns (j) represent different locations in the warehouse shelf (0 to 4)
// Each product entry in the array occupies 4 bytes.
// Write a C program that:
// 1. Accepts the base address of the inventory array.
// 2. Takes input: the index of the product (i, j).
// 3. Asks the user whether the data is stored in RMO or CMO.
// 4. Calculates and displays the memory address of Inventory[i][j] based on the
// selected order.
// 5. Validates that the indices are within range.

#include <stdio.h>

int main() {
    int nr,nc,i,j,baseadd,isRMO,size,result;

    printf("Enter the base address: ");scanf("%d",&baseadd);
    printf("Enter the no. of rows, columns(with a space): ");scanf("%d %d",&nr,&nc);
    printf("Enter the index of the product you want have the base address (with a space): ");scanf("%d %d",&i,&j);
    
    if(i>nr || j>nc){printf("Wrong indexes!!");return 1;}

    printf("Enter the size of each entry: ");scanf("%d",&size);
    printf("Enter 1 if the the storing is done in RMO or 0 for CMO: ");scanf("%d",&isRMO);

    result = baseadd + ((isRMO) ? ((i*nc)+j) : ((j*nr)+i)) * size;

    printf("The result base address is %d",result);


    return 0;
}