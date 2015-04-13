#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <math.h>
#include <time.h>
#include <stdbool.h>
#include "graph.h"
#include "d_heap.h"
#include "fibonacciHeap.h"
#include "dijkstra.h"

int main(void)  {
	adj_list* graph;
	fibHeap* heap_in;
	node_dist node_dist_out;
	srand(time(NULL));
	graph=new_erdos_graph(0.1,10,4,false);
	print_adj_list(graph);
	//print_dist_pred(graph,3);
	//delete_adj_list(graph);
	heap_in= fib_new_heap(graph,0);
	SerializeFib(heap_in->min);
	printf("\n");
	node_dist_out=fib_extract_min(heap_in);
	printf("minimo estratto id %d chive %d \n", node_dist_out.node, node_dist_out.dist);
	SerializeFib(heap_in->min);
	return 0;
}
