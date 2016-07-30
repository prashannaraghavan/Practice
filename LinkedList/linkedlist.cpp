#include <iostream>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

struct Node* head;

struct Node
{
	int data;
	struct Node *next;
};

void push(int data)
{
	struct Node* temp = (struct Node *)malloc(sizeof(struct Node));
	temp->data = data;
	temp->next = head;
	head = temp; 
}

void print(struct Node* temp)
{
	while(temp != NULL)
	{
		cout<<temp->data<<" ";
		temp = temp->next;
	}

	cout<<endl;
}

int main()
{
	head = NULL;
	push(5);
	push(6);

	print(head);
	

	return 0;
}