#include <stdio.h>
#include <stdlib.h>
#define SIZE 10000  //전체 스택크기 
#define INF 99999999

typedef struct Node {
    int data;
    struct Node *next;
} Node;

typedef struct Stack  {
    Node *top;
} Stack;

void push(Stack *stack, int data){
    Node *node = (Node*)malloc(sizeof(Node));
    node->data=data;

    node->next = stack->top;
    stack->top=node;
}
int pop(Stack *stack){
    if (stack->top == NULL){
        printf("underflow");
        return -INF;
    }
    Node *node = stack->top;
    int data = node->data;

    stack->top=node->next;
    free(node);
    return data;
}
int main(void){
    Stack stack;
    stack.top = NULL;
    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);
    push(&stack, 4);
    pop(&stack);
    return 0;
}