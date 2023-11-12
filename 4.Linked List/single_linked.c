#include <stdio.h>
#include <stdlib.h>

// creating a node
struct node{
    int data; 
    struct node *next; 
}; 

 
int main(){
    struct node *head = NULL;
    head = (struct node *)malloc(sizeof(struct node));
    return 0; 
}                           