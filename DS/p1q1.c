// You are developing a simple C program for a school to evaluate students' performance in a
// subject. The teacher enters the marks of n students (out of 100). Your task is to:
// Tasks:
// 1. Accept the marks from the user and store them in a 1D array.
// 2. Display each student's marks with their memory address.
// 3. Count and display:
// • Number of students who scored above 75 (Distinction).
// • Number of students who scored between 35 and 75 (Pass).
// • Number of students who scored below 35 (Fail).

#include <stdio.h>

void inputMarks(int *arr,int  n){
    printf("Enter the marks of the students: \n");
    for(int i=0;i<n;i++){
        printf("%d :",i+1);
        scanf("%d",&arr[i]);
    }
}

void displayMarksWithMaddress(int *arr,int n){
    printf("\tSl. No.\t|\tMarks\t|\tMemory address\n");
    for(int i=0;i<n;i++){
        printf("\t%d\t|\t%d\t|\t%u\n",i+1,arr[i],&arr[i]);
    }
}

void fancyDisplay(int *arr,int n){
    int c1=0,c2=0,c3=0;
    for(int i=0;i<n;i++){
        if(arr[i]>75){c1++;}
        else if(arr[i]<=75 && arr[i]>35){c2++;}
        else{c3++;}
    }

    printf("Number of students who scored above 75 (Distinction): %d\n",c1);
    printf("Number of students who scored between 35 and 75 (Pass): %d\n",c2);
    printf("Number of students who scored below 35 (Fail): %d\n",c3);
}

int main() {
    int n;
    printf("Enter the number of students: ");
    scanf("%d",&n);

    int marks[n];    
    inputMarks(marks,n);
    displayMarksWithMaddress(marks,n);
    fancyDisplay(marks,n);

    return 0;
}