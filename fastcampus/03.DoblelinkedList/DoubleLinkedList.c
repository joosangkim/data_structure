#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    int data;
    struct Node *next;
    struct Node *prev;
} Node;

Node *head, *tail;

// asc 
void insert(int data){
    Node *node = (Node*)malloc(sizeof(Node));
    node->data=data;
    Node *cur = head->next;
    while(cur->data < node->data && cur != tail){
        cur = cur->next;
    }
    Node *prev = cur->prev;
    prev->next=node;
    node->prev=prev;

    cur->prev=node;
    node->next=cur;

}

// removeFront
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