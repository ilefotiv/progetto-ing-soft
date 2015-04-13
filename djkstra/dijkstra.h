//dikstra

//struttura output di djikstra...dist è la distanza di un nodo da source e pred è il predecessore
//nel cammino minimo

typedef struct dist_pred{
	int dist;
	int pred;
} dist_pred;

typedef d_heap heap;


//algoritmo di dijkstra

dist_pred* dijkstra(adj_list* adj_list_in, int source) {
	int num_nodes; node_dist node_dist_out; dist_pred* dist_pred_out; heap* heap_in;list* list_in;
	num_nodes=adj_list_in->num_nodes;
	dist_pred_out=(dist_pred*)malloc(num_nodes*sizeof(dist_pred));
	heap_in=new_d_heap(adj_list_in,source);
	dist_pred_out[source].pred=source;
	while(!empty_heap(heap_in)){
		node_dist_out=extract_min(heap_in);
		dist_pred_out[node_dist_out.node].dist=node_dist_out.dist;
		list_in=adj_list_in->node[node_dist_out.node];
		while(list_in!=NULL){
			if (decrease_dist(heap_in,list_in->node,node_dist_out.dist+(list_in->dist)))
				dist_pred_out[list_in->node].pred=node_dist_out.node;
			list_in=list_in->next;
		}
	}
	return dist_pred_out;
}

//esegue dijkstra e stampa l'output

void print_dist_pred(adj_list* adj_list_in, int source){
	dist_pred* dist_pred_out;int num_nodes,i;
	dist_pred_out=dijkstra(adj_list_in,source);
	num_nodes=adj_list_in->num_nodes;
	for (i=0;i<num_nodes;i++){
		printf("dist(%d,%d)=%d, pred(%d)=%d\n",source,i,dist_pred_out[i].dist,i,dist_pred_out[i].pred);
	}
}
