#include <stdio.h>
#include <string.h> 
#include <stdlib.h>
#include <ctype.h>
#define N 10

char stack[N];
int top = -1;

void push(char stack[], char val)
{
    if (top == N-1)
    {
        printf("Stack is overflow!");
    }
    else
    {
        top++;
        stack[top] = val;
    }
}

char pop(char stack[])
{
    int val = ' ';
    if (top == -1)
    {
        printf("Stack is Underflow!");
    }
    else
    {
        val = stack[top];
        top--;
    }

    return val;
}

int getPriority(char op)
{
    if (op == '/' || op == '*' || op == '%')
    {
        return 1;
    }
    else if (op == '+' || op == '-')
    {
        return 0;
    }
}

void InfixtoPostfix(char source[], char target[])
{
    int i = 0, j = 0;
    char temp;
    strcpy(target, "");
    while (source[i] != '\0')
    {
        if (source[i] == '(')
        {
            push(stack, source[i]);
            i++;
        }
        else if (source[i] == ')')
        {
            while ((top != -1) && (stack[top] != '('))
            {
                target[j] = pop(stack);
                j++;
            }
            if (top == -1)
            {
                printf("\n INCORRECT EXPRESSION");
                exit(1);
            }
            temp = pop(stack); // remove the perenthesis
            i++;
        }
        else if (isdigit(source[i]) || isalpha(source[i]))
        {
            target[j] = source[i];
            j++;
            i++;
        }
        else if (source[i] == '+' || source[i] == '-' || source[i] == '*' || source[i] == '/' || source[i] == '%')
        {
            while ((top != -1) && (stack[top] != '(') && (getPriority(stack[top]) >= getPriority(source[i])))
            {
                target[j] = pop(stack);
                j++;
            }
            push(stack, source[i]);
            i++;
        }
        else
        {
            printf("\n INCORRECT ELEMENT IN EXPRESSION");
            exit(1);
        }
    }
    while ((top != -1) && (stack[top] != '('))
    {
        target[j] = pop(stack);
        j++;
    }
    target[j] = '\0';
}


int main()
{

    char infix[100], postfix[100];

    printf("Enter your infix expression : ");
    scanf("%c", &infix);


    strcpy(infix,""); 

    InfixtoPostfix(infix,postfix); 

    printf("The postfix expression is : "); 

    // for(int i=0; i<N; i++){
    //     printf("%d",postfix[i]);
    // }

    
    
    return 0;
}


// A+B-C/(D*E)