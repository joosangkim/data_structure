#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int data;
    struct Node *next;
} Node;

Node *head;

void addFront(Node *root, int data){
    Node *node = (Node *)malloc(sizeof(Node));
    node->data=data;
    node->next=root->next;
    root->next=node;
}

void remoteFront(Node *root){
    Node *front=root->next;
    root->next=front->next;
    free(front);
}

void freeAll(Node *root){
    Node *cur = head->next;
    while( cur->next != NULL){
        Node *next = cur->next;
        free(cur);
        cur = next;
    }
}


int main(void)
{
    head = (Node *)malloc(sizeof(Node)); // allocate header node 
    head->next=NULL;
    Node *node1 = (Node *)malloc(sizeof(Node)); // allocate 1st node
    node1->data = 1;
    Node *node2 = (Node *)malloc(sizeof(Node)); // allodate 2nd node
    node2->data = 2;
    head->next = node1; // head to node1
    node1->next = node2; // node1 to node2
    node2->next = NULL; // node2 is last node
    Node *cur = head->next;
    while (cur != NULL)
    {
        printf("%d ", cur->data);
        cur = cur->next;
    }
    printf("\n");
    return 0;
}