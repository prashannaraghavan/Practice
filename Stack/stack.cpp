#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

using namespace std;

struct Stack
{
	int top;
	unsigned capacity;
	int *array;
};

struct Stack* createStack(int capacity)
{
	struct Stack* stack = (struct Stack *)malloc(sizeof(struct Stack));
	stack->top = -1;
	stack->capacity = capacity;
	stack->array = (int *)malloc(stack->capacity*sizeof(int));
	return stack;
}

int isEmpty(struct Stack *stack)
{
	return (stack->top == -1);
}

int isFull(struct Stack *stack)
{
	return (stack->top == stack->capacity - 1);
}

void push(struct Stack *stack,int value)
{
	if (isFull(stack))
		return;
	stack->array[++stack->top] = value;
	printf("Pushed %d on to stack\n",value);
}

int pop(struct Stack *stack)
{
	if (isEmpty(stack))
		return INT_MIN;
	return stack->array[stack->top--];
}

int top(struct Stack *stack)
{
	if (isEmpty(stack))
        return INT_MIN;
	return stack->array[stack->top];
}

int main()
{
	struct Stack *stack = createStack(10);
	push(stack,10);
	push(stack,20);
	push(stack,30);
	push(stack,40);
	push(stack,50);
	push(stack,60);
	push(stack,70);
	push(stack,80);
	push(stack,90);
	push(stack,100);
	push(stack,110);
	printf("Top : %d\n",top(stack));
	printf("Popped Item : %d\n",pop(stack));
	printf("Top : %d\n",top(stack));
	return 0;
}