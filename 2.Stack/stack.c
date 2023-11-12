#include <stdio.h>
#define N 5

int stack[N];
int top = -1;

void push(){
    int x; 
    printf("Enter data to push : "); 
    scanf("%d",&x); 

    if(top == N-1){
        printf("Overflow!"); 
    }else{
        top++; 
        stack[top]=x;
    }
}

void pop(){
    int item; 
    if(top == -1){
        printf("Underflow!"); 
    }else{
        item = stack[top]; 
        top--; 
    }
}

void peek(){
    if(top == -1){
        printf("stack is empty!"); 
    }else{
        printf("%d",stack[top]); 
    }
}

void display(){
    for(int i=top; i>=0; i--){
        printf("%d",stack[i]); 
    }
}

int main(){

    int choice; 

    do{

        printf("\n 1.push 2.pop 3.peek 4.display 0.Exit \n");
        printf("\nEnter your choice : ");
        scanf("%d",&choice); 

        switch(choice){
            case 1:  push();
                     break;

            case 2:  pop();
                     break;

            case 3:  peek();
                     break;

            case 4:  display();
                     break;

            case 0:  break;

            default : printf("Invalid choice! \n");
                      break;  
        }

    }while(choice!=0); 
    return 0;
}