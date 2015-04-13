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

int main(void) {
	adj_list* graph;
	srand(time(NULL));
	graph = new_erdos_graph(0.6, 10, 4, false);
	print_adj_list(graph);
	print_dist_pred(graph,0);
	delete_adj_list(graph);
	//fibHeap * h = fib_new_heap(graph, 3);
	/*while (!fib_empty_heap(h)) {
		printf("minimo %d \n", fib_extract_min(h).node);
		SerializeFib(h->min);
		printf("\n");
	}*/
	return 0;
}
