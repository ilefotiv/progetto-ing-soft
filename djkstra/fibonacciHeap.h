/*
 * fibonacciHeap.c
 *
 *  Created on: 12/apr/2015
 *      Author: emilio-gssi
 */
/*
 * structure of the generic fibanacci heap node
 */
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

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
	//indica se il nodo è stato scandito nella lista (aggiunta all'algoritmo)
	bool consolidated;
} fibNode;

/*
 *  handle of the heap
 */
typedef struct fibHeap {
	// pointer to the node with minimum key value in the tree list of the heap
	fibNode * min;
	// number of node in the heap
	int n;
	//lista ausiliaria per memorizzare i puntatori ai nodi
	fibNode ** dict;
	//dimensione della lista nodi
	int numNode;
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
	newNode->consolidated = false;
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
//rende y figlio di x nell'heap h
void FIB_HEAP_LINK(fibHeap * h, fibNode * y, fibNode * x) {
	//1 remove y from the root list of H
	y->left->right = y->right;
	y->right->left = y->left;
	//2 make y a child of x, incrementing x:degree
	y->parent = x;
	x->degree++;
	if (x->child != NULL) {
		y->left = x->child->left;
		y->left->right = y;
		y->right = x->child;
		x->child->left = y;
	} else {
		y->left = y;
		y->right = y;
		x->child = y;
	}
	//3 y:mark D FALSE e consolidato a false
	y->marked = false;
	y->consolidated = false;
}

//funzione che consolida la struttura dell'heap
void CONSOLIDATE(fibHeap *h) {
	int arraySize = ((int) (log(h->n) / log(2))) + 1;
	//dichiaro il nuvo array con lunghezza al massimo log(n)
	fibNode ** A = (fibNode**) malloc(arraySize * sizeof(fibNode*));
	for (int i = 0; i < arraySize; i++) {
		A[i] = NULL;
	}
	//per ogni nodo nella rootList
	fibNode * w = h->min;
	//memorizzo il grado della radice che consolido
	int d = 0;
	fibNode * x = NULL;
	fibNode * y = NULL;
	fibNode * t = NULL;
	while (w->consolidated == false) {
		w->consolidated = true;
		//printf("consolido radice %d \n",w->data);
		//printf("grado radice %d \n",w->degree);
		x = w;
		d = x->degree;
		while (A[d] != NULL) {
			y = A[d]; // another node with the same degree as x
			if (x->key > y->key) {
				//10 exchange x with y
				t = x;
				x = y;
				y = t;
			}
			//printf("nodo %d diventa figlio di nodo %d \n", y->data, x->data);
			FIB_HEAP_LINK(h, y, x);
			A[d] = NULL;
			d++;
		}
		A[d] = x;
		w = x->right;
	}
	h->min = NULL;
	//ricreo l'heap a partire dall'array A
	for (int i = 0; i < arraySize; i++) {
		if (A[i] != NULL) {
			A[i]->consolidated = false;
			if (h->min == NULL) {
				A[i]->parent = NULL;
				A[i]->left = A[i];
				A[i]->right = A[i];
				h->min = A[i];
			} else {
				//printf("muovo il nodo %d nella lista delle radici", A[i]->data);
				MOVE_NODE_TO_THEROOT(h, A[i]);
				if (A[i]->key < h->min->key)
					h->min = A[i];
			}
		}
	}
	free(A);
}
// deletes the element from heap H whose key is minimum,
// returning a pointer to the element.
// consolidate the heap structure
node_dist fib_extract_min(fibHeap *h) {
	node_dist out;
	fibNode * z = h->min;
	if (z != NULL) {
		if (z->child != NULL) {
			//add the child of z as new root in the root list
			fibNode * tempChild = z->child->right;
			fibNode * x;
			MOVE_NODE_TO_THEROOT(h, z->child);
			//scandisco i figli sulla destra
			while (tempChild != z->child) {
				//x è il nodo da aggiungere alla lista
				x = tempChild;
				tempChild = tempChild->right;
				//aggiungo x alla root list
				MOVE_NODE_TO_THEROOT(h, x);
				//scandisco la lista a destra
			}
		}
		//rimuovo z dalla lista
		z->left->right = z->right;
		if (z->right != z) {
			z->right->left = z->left;
			h->min = z->right;
		} else
			h->min = NULL;
		h->n--;
		if(h->n!=0)
			CONSOLIDATE(h);
	}
	out.node=z->data;
	out.dist=z->key;
	return out;
}
/*
 * creates and returns a new heap that contains all the elements of
 * heaps H 1 and H 2 . Heaps H 1 and H 2 are “destroyed” by this operation
 */
fibHeap * UNION(fibHeap * h1, fibHeap * h2) {
	//not implemented because useless for our application
	return NULL;
}

//REMOVE THE NODE X FROM THE CHILD LIST OF Y
void CUT(fibHeap * h, fibNode * x) {
	/*remove x from the child list of y, decrementing y:degree
	 2 add x to the root list of H*/
	fibNode * p = x->parent;
	//caso in cui x è il figlio puntato da child
	if (p->child == x) {
		if (x->right == x) {
			if (x->left == x) {
				p->child = NULL;
			} else {
				p->child = x->left;
			}
		} else {
			p->child = x->right;
		}
	}
	x->parent->degree--;
	x->parent = NULL;
	//collego i suoi fratelli
	x->right->left = x->left;
	x->left->right = x->right;
	//lo inserisco nella lista delle radici
	x->left = h->min->left;
	x->left->right = x;
	h->min->left = x;
	x->right = h->min;
	x->marked = false;
}

void CASCADING_CUT(fibHeap * h, fibNode * y) {
	fibNode * z = y->parent;
	if (z != NULL) {
		if (y->marked == false) {
			y->marked = true;
		} else {
			CUT(h, y);
			CASCADING_CUT(h, z);
		}
	}
}

// assigns to element x within heap H the new key value k, which we
// assume to be no greater than its current key value.
bool fib_decrease_dist(fibHeap * h, int node, int k) {
	fibNode * p = NULL;
	fibNode * x = h->dict[node];
	if (k > x->key)
		return false;
	x->key = k;
	p = x->parent;
	if (p != NULL && x->key < p->key) {
		CUT(h, x);
		CASCADING_CUT(h, p);
	}
	if (x->key < h->min->key)
		h->min = x;
	return true;
}

// deletes element x from heap H.
fibHeap * DELETE(fibHeap * h, fibNode *x) {
	return NULL;
}

//Prints all the elements in linked list in forward traversal order
void SerializeFib(fibNode * min) {
	if (min != NULL) {
		printf("{ %d ", min->data);
		SerializeFib(min->child);
		printf("}");
		fibNode* temp = min->left;
		while (temp != min) {
			printf("{ %d ", temp->data);
			SerializeFib(temp->child);
			printf("}");
			temp = temp->left;
		}
	}
}

fibHeap * fib_new_heap(adj_list* graph,int source) {
	fibHeap * h=MAKE_FIB_HEAP();
	int key;
	//inizializzo la lista dei nodi
	h->numNode=graph->num_nodes;
	h->dict = (fibNode **) malloc(h->numNode * sizeof(fibNode*));
	for (int i = 0; i < graph->num_nodes; i++) {
		if(i==source){
			key=0;
		}else{
			key=INFINITY_VALUE;
		}
		fibNode * x = GetNewNode(i, key);
		//inserisco il nodo i nella posizione i della lista
		h->dict[i] = x;
		FIB_HEAP_INSERT(h, x);
	}
	return h;
}

bool fib_empty_heap(fibHeap * h){
	if(h->n==0){
		for(int i=0; i<h->numNode; i++){
			free(h->dict[i]);
		}
		free(h->dict);
		free(h);
		return true;
	}else
		return false;
}

//int main() {
//	fibHeap * h= MAKE_FIB_HEAP();
//	adj_list* graph;
//	srand(time(NULL));
//	graph=new_erdos_graph(0.2,10);
//	print_adj_list(graph);
//	return 0;
//}

