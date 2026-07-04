// Q2) A small store wants to track the stock levels of its top 10 products. Each product has a
// unique ID from 1 to 10 and a quantity in stock. Write a C program to:
// Tasks:
// 1. Store the quantities of the 10 products in an array.
// 2. Display each product's quantity with its memory address.
// 3. Identify and print the products with stock less than 5 units as "Low Stock Alert",
// along with their addresses.

#include <stdio.h>

void input(int *arr,int  n){
    printf("Enter the quantity of the products according to their unique id: \n");
    for(int i=0;i<n;i++){
        printf("%d :",i+1);
        scanf("%d",&arr[i]);
    }
}

void displayWithMaddress(int *arr,int n){
    printf("Uni. ID\t| Quantity\t| Memory address\n");
    for(int i=0;i<n;i++){
        printf("%d\t|\t%d\t|\t%u\n",i+1,arr[i],&arr[i]);
    }
}

void fancyDisplay(int *arr,int n){
    printf("Low Stock Alert!! for the following unique ids: ");
    for(int i=0;i<n;i++){
        if(arr[i]<5){
            printf("%d ",i+1);
        }

    }
}

int main() {
    int n=10;
    int quantity[n];    
    input(quantity,n);
    displayWithMaddress(quantity,n);
    fancyDisplay(quantity,n);

    return 0;
}