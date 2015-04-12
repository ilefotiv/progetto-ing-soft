/*
 * fibonacciHeap.c
 *
 *  Created on: 12/apr/2015
 *      Author: emilio-gssi
 */
/* Doubly Linked List implementation */
#include<stdio.h>
#include<stdlib.h>
#include <stdbool.h>

/*
 * structure of the generic fibanacci heap node
 */
typedef struct fibNode {
	// id of the element in the heap
	int data;
	// key of this element
	int key;
	// pointer to the parent of this node
	struct fibNode * parent;
	// pointer to any one of its children
	struct fibNode * child;
	// pointer to the right sibling of this node
	struct fibNode* right;
	// pointer to the left sibling of this node
	struct fibNode* left;
	// number of node in the child list of this node
	int degree;
	//indicates whethernode x has lost a child since
	//the last time x was made the child of another node
	bool marked;
} fibNode;

/*
 *  handle of the heap
 */
typedef struct fibHeap {
	// pointer to the node with minimum key value in the tree list of the heap
	fibNode * min;
	// number of node in the heap
	int n;
} fibHeap;

const int INFINITY_VALUE = 200000;

//Creates a new Node for the heap for the heap
fibNode* GetNewNode(int id, int key) {
	struct fibNode* newNode = (fibNode*) malloc(sizeof(fibNode));
	newNode->data = id;
	newNode->key = key;
	newNode->left = newNode;
	newNode->right = newNode;
	newNode->degree = 0;
	newNode->child = NULL;
	newNode->marked = false;
	newNode->parent = NULL;
	return newNode;
}

/*
 * Interface of the heap
 */

//creates and returns a new heap containing no elements.
fibHeap * MAKE_FIB_HEAP() {
	fibHeap * h = (fibHeap*) malloc(sizeof(fibHeap));
	h->min = NULL;
	h->n = 0;
	return h;
}
// inserts element x, whose key has already been ﬁlled in, into heap H
void FIB_HEAP_INSERT(fibHeap * h, fibNode * x) {
	if (h->min == NULL) {
		h->min = x;
	} else {
		x->left = h->min->left;
		x->left->right = x;
		h->min->left = x;
		x->right = h->min;
		if (h->min->key > x->key)
			h->min = x;
	}
	h->n++;
}

//sposta un nodo nell root list dell'heap
void MOVE_NODE_TO_THEROOT(fibHeap * h, fibNode * x) {
	x->left = h->min->left;
	x->left->right = x;
	h->min->left = x;
	x->right = h->min;
	x->parent = NULL;
}

//returns a pointer to the element in heap H whose key is minimum.
fibNode * MINIMUM(fibHeap * h) {
	return h->min;
}
//funzione che consolida la struttura dell'heap
void CONSOLIDATE(fibHeap *h) {

}
// deletes the element from heap H whose key is minimum,
// returning a pointer to the element.
// consolidate the heap structure
fibNode * FIB_HEAP_EXTRACT_MINN(fibHeap *h) {
	fibNode * z = h->min;
	if (z != NULL) {
		if (z->child != NULL) {
			//add the child of z as new root in the root list
			fibNode * tempRChild = z->child;
			fibNode * tempLChild = z->child->left;
			fibNode * x;
			//scandisco i figli sulla destra
			while (tempRChild != NULL) {
				//x è il nodo da aggiungere alla lista
				x = tempRChild;
				//aggiungo x alla root list
				MOVE_NODE_TO_THEROOT(h, x);
				//scandisco la lista a destra
				tempRChild = tempRChild->right;
			}
			//scandisco i figli sullla sinistra
			while (tempLChild != NULL) {
				//x è il nodo da aggiungere alla lista
				x = tempLChild;
				//aggiungo x alla root list
				MOVE_NODE_TO_THEROOT(h, x);
				//scandisco la lista a destra
				tempLChild = tempLChild->left;
			}
		}
		//rimuovo z dalla lista
		z->left->right = z->right;
		if (z->right != z) {
			z->right->left = z->left;
			h->min = z->right;
		} else
			h->min = NULL;
		CONSOLIDATE(h);
		h->n--;
	}
	return z;
}
/*
 * creates and returns a new heap that contains all the elements of
 * heaps H 1 and H 2 . Heaps H 1 and H 2 are “destroyed” by this operation
 */
fibHeap * UNION(fibHeap * h1, fibHeap * h2) {
	//not implemented because useless for our application
	return NULL;
}
// assigns to element x within heap H the new key value k, which we
// assume to be no greater than its current key value.
fibHeap * DECREASE_KEY(fibHeap * h, fibNode * x, int k) {
	return NULL;
}

// deletes element x from heap H.
fibHeap * DELETE(fibHeap * h, fibNode *x) {
	return NULL;
}


//Prints all the elements in linked list in forward traversal order
void Print(fibHeap * h) {
	if (h->min != NULL) {
		printf("Heap: ");
		printf("%d ",h->min->data);
		fibNode* temp = h->min->left;
		while(temp!=h->min){
			printf("%d ",temp->data);
			temp=temp->left;

		}
		printf("\n");
	}else
		printf("heap vuoto ");

}


//int main() {
//	fibHeap * h= MAKE_FIB_HEAP();
//	adj_list* graph;
//	srand(time(NULL));
//	graph=new_erdos_graph(0.2,10);
//	print_adj_list(graph);
//	return 0;
//}

