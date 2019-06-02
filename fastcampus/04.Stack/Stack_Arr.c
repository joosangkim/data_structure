#include <stdio.h>
#define SIZE 10000  //전체 스택크기 
#define INF 99999999

int stack[SIZE];
int top = -1; // stack top

void push(int data){
    if (SIZE-1 == top){
        printf("Full stack");
        return;
    }
    stack[++top] = data;
}

int pop(){
    if (top == -1){
        printf("No data");
        return -INF;
    }
    return stack[top--];
}

void show(){
    for(int i = top; i>-1; i--){
        printf("%d ", stack[i]);
    }
    printf("\n");
}

int main(void){
    push(1);
    push(3);
    push(4);
    show();
    printf("%d\n", pop());
    show();
    printf("%d\n", pop());
    show();
    return 0;
}