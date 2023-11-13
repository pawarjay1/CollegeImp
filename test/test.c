#include<stdio.h> 

int stack[10]; 
int top = -1; 

int N = sizeof(stack)/sizeof(stack[0]);


void push(){
    int x; 
    printf("Enter number to push : "); 
    scanf("%d",&x); 

    if(top == N-1){
        printf("Stack is overflow!"); 
    }
    else{
        top++; 
        stack[top]=x; 
    }
}

void pop(){
    int item; 
    if(top == -1){
        printf("Stack is underflow!");
    }
    else{
        stack[top]=item; 
        top--; 
    }
}

void peek(){
    if(top == -1){
        printf("Stack is empty!"); 
    }
    else{
        printf("%d",stack[top]);
    }
}

void display(){
    for(int i = top; i>=0; i--){
        printf("%d",&stack[top]); 
    }
}

int main(){
    int choice; 

    do{
        printf("1.push  2.pop  3.peek  4.display  \n"); 
        printf("Enter choice : "); 
        scanf("%d",&choice); 

        switch(choice){
            case 1: push(); 
                    break; 
            case 2: pop(); 
                    break; 
            case 3: peek(); 
                    break; 
            case 4: display(); 
                    break; 
            default: printf("invelid choice"); 
                    break; 
        }
    }while(choice!=0); 
    return 0;
}
