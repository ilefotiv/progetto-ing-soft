
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <math.h>
#include <time.h>
#include <stdbool.h>

//liste


typedef struct node_key{
	int node;
	int key;
}node_key;


typedef struct list {
	struct list* next;
	int elem;
	int key;
} list;

list* add_elem(list* list_in, int elem_in, int key_in) {
		list* list_out=(list*)malloc(sizeof(list));
		list_out->next=list_in;
		list_out->elem=elem_in;
		list_out->key=key_in;
		return list_out;
}

list* delete_elem(list* list_in){
	list* list_out=list_in->next;
	free(list_in);
	return list_out;
}

//liste di adiacenza

typedef struct adj_list {
	list **node;
	int num_nodes;
	int num_edges;
}adj_list;

adj_list* new_adj_list(int num_nodes){
	int i;
	adj_list* adj_list_out=(adj_list*)malloc(sizeof(adj_list));
	adj_list_out->num_nodes=num_nodes;
	adj_list_out->num_edges=0;
	adj_list_out->node=(list**)malloc(num_nodes*sizeof(list*));
	for(i=0;i<num_nodes;i++){
		adj_list_out->node[i]=NULL;
	}
	return adj_list_out;
}

void add_edge_und(adj_list* adj_list_in, int i,int j, int w){
	adj_list_in->node[i]=add_elem(adj_list_in->node[i],j,w);
	adj_list_in->node[j]=add_elem(adj_list_in->node[j],i,w);
	adj_list_in->num_edges++;
}

void delete_adj_list(adj_list* adj_list_in){
	int i;list* p;
	for(i=0;i<adj_list_in->num_nodes;i++){
		p=adj_list_in->node[i];
		while(p!=NULL){
			p=delete_elem(p);
		}
	}
	free(adj_list_in->node);
}

typedef struct edge{
	int node1;
	int node2;
} edge;


void print_adj_list(adj_list* adj_list_in){
	int i;list* p;
	for(i=0;i<adj_list_in->num_nodes;i++){
		p=adj_list_in->node[i];
		printf("%d->[",i);
		while(p!=NULL){
			printf("(%d,%d) ",p->elem,p->key);
			p=p->next;
		}
		printf("] \n");
	}
	printf("\n");
}

edge* complete_array_edge(int num_nodes){
	edge* edge_out;int i,j,k;
	edge_out=(edge*)malloc((num_nodes*(num_nodes-1)/2-1)*sizeof(edge));
	k=0;
	for(i=0;i<num_nodes;i++){
		for(j=0;j<i;j++,k++){
			edge_out[k].node1=i;
			edge_out[k].node2=j;
		}
	}
	return edge_out;
}


//grafi random

adj_list* new_erdos_graph(double p,int num_nodes, int max_value){
	adj_list* adj_list_out; int i,j,r,p_big=(int)(p*RAND_MAX);
	max_value++;
	adj_list_out=new_adj_list(num_nodes);
	for(i=0;i<num_nodes;i++){
		for(j=0;j<i;j++){
			r=rand();
			if (r<=p_big){
				add_edge_und(adj_list_out,i,j,r % max_value);
				adj_list_out->num_edges++;
			}
		}

	}
	return adj_list_out;
}

adj_list* new_unif_graph(int num_nodes,int num_edges,edge* edge_in,int max_value){
	int i,num_nodes_curr,w,pick;adj_list* adj_list_out;
	num_nodes_curr=num_nodes*(num_nodes-1)/2;
	adj_list_out=new_adj_list(num_nodes);
	for(i=0;i<num_edges;i++,num_nodes_curr--){
		pick=rand()%num_nodes_curr;
		w=rand()%max_value;
		add_edge_und(adj_list_out,edge_in[pick].node1,edge_in[pick].node2,w);
		edge_in[pick]=edge_in[num_nodes_curr-1];
	}
	adj_list_out->num_edges=num_edges;
	return adj_list_out;
}

//d_heap

typedef struct elem_key{
	int elem;//restituisce il nodo in posizione sort
	int key;//restituisce la chiave a partire dalla posizione nell'heap del nodo
	int sort;//restituisce la posizione nell'heap del nodo elem
}elem_key;

typedef struct heap{
	elem_key* ek;
	int num_nodes;
	int num_sons;
} heap;

void sweep(elem_key* elem_key_in, int sort1,int sort2){
	int sr, k; int el;
	el=elem_key_in[sort2].elem;
	elem_key_in[sort2].elem=elem_key_in[sort1].elem;
	elem_key_in[sort1].elem=el;
	k=elem_key_in[sort2].key;
	elem_key_in[sort2].key=elem_key_in[sort1].key;
	elem_key_in[sort1].key=k;
	sr=elem_key_in[sort1].elem;
	elem_key_in[sr].sort=sort1;
	sr=elem_key_in[sort2].elem;
	elem_key_in[sr].sort=sort2;
}

heap* new_heap(adj_list* adj_list_in,int source,int num_sons){
	heap* heap_out; elem_key* elem_key_in; int i,num_nodes=adj_list_in->num_nodes;
	heap_out=(heap*)malloc(sizeof(heap));
	heap_out->num_sons=num_sons;
	heap_out->num_nodes=num_nodes;
	heap_out->ek=(elem_key*)malloc((num_nodes)*sizeof(elem_key));
	elem_key_in=heap_out->ek;
	for (i=0;i<num_nodes;i++){
		elem_key_in[i].elem=i;
		elem_key_in[i].sort=i;
		elem_key_in[i].key=INT_MAX;
	}
	sweep(elem_key_in,0,heap_out->ek[source].sort);
	elem_key_in[0].key=0;
	return heap_out;
}



bool decrease_key(heap* heap_in, int elem_in,int key_in){
	int sort1,sort2,num_sons;elem_key* elem_key_in;
	elem_key_in=heap_in->ek;
	num_sons=heap_in->num_sons;
	sort1=elem_key_in[elem_in].sort;
	if (key_in<elem_key_in[sort1].key){
		heap_in->ek[sort1].key=key_in;
		sort2=sort1;
		sort1=(sort2-1)/num_sons;
		while(elem_key_in[sort1].key>elem_key_in[sort2].key && sort2>0){
			sweep(elem_key_in,sort1,sort2);
			sort2=sort1;
			sort1=(sort2-1)/num_sons;
		}
		return true;
	}
	return false;
}

bool empty_heap(heap* heap_in){
	if(heap_in->num_nodes>0)return false;
	free(heap_in->ek);
	free(heap_in);
	return true;
}

void print_heap(heap* heap_in){
	int i;
	for (i=0;i<heap_in->num_nodes;i++) printf("(%d,%d,%d)",heap_in->ek[i].elem,heap_in->ek[i].key,heap_in->ek[i].sort);
	printf("\n");
}


node_key extract_min(heap* heap_in){
	node_key node_key_out;int sort1=0, sort2, i,first_son1, last_son1, num_sons=heap_in->num_sons;
	elem_key* elem_key_in=heap_in->ek;
	int num_nodes=heap_in->num_nodes;
	node_key_out.node=heap_in->ek[0].elem;
	node_key_out.key=heap_in->ek[0].key;
	first_son1=1;
	while(first_son1<num_nodes){
		sort2=first_son1;
		if(first_son1+num_sons<num_nodes) last_son1=first_son1+num_sons;
		else last_son1=num_nodes;
		for(i=first_son1+1;i<last_son1;i++){
			if (elem_key_in[i].key<elem_key_in[sort2].key){
				sort2=i;
			}
		}
		sweep(elem_key_in,sort1,sort2);
		sort1=sort2;
		first_son1=sort1*num_sons+1;
	}
	sweep(elem_key_in,sort1,num_nodes-1);
	heap_in->num_nodes--;
	return node_key_out;
}



//prove di connessione

void connected(adj_list* adj_list_in, int source, int* reach){
	list* node=adj_list_in->node[source]->next;
	while (node!=NULL){
		if(reach[node->elem]==0) {
		reach[node->elem]=1;
		connected(adj_list_in,node->elem,reach);
		}
		node=node->next;
	}
}

int connected2(adj_list* adj_list_in,int source){
	int* reach; int i,n=0;
	reach=(int*)malloc((adj_list_in->num_nodes)*sizeof(int));
	for(i=0;i<adj_list_in->num_nodes;i++) reach[i]=0;
	reach[source]=1;
	connected(adj_list_in,source,reach);
	for(i=0;i<adj_list_in->num_nodes;i++){
		if(reach[i]==1) n++;
	}
	return n;
}

//sopra va ->num_nodes
//djikstra

typedef struct dist_pred{
	int dist;
	int pred;
} dist_pred;

dist_pred* dijkstra(adj_list* adj_list_in, int source) {
	int num_nodes; node_key node_key_out; dist_pred* dist_pred_out; heap* heap_in;list* list_in;
	num_nodes=adj_list_in->num_nodes;
	dist_pred_out=(dist_pred*)malloc(num_nodes*sizeof(dist_pred));
	heap_in=new_heap(adj_list_in,source,2);
	dist_pred_out[source].pred=source;
	while(!empty_heap(heap_in)){
		node_key_out=extract_min(heap_in);
		dist_pred_out[node_key_out.node].dist=node_key_out.key;
		list_in=adj_list_in->node[node_key_out.node];
		while(list_in!=NULL){
			if (decrease_key(heap_in,list_in->elem,node_key_out.key+(list_in->key)))
				dist_pred_out[list_in->elem].pred=node_key_out.node;
			list_in=list_in->next;
		}
	}
	return dist_pred_out;
}

void print_dist_pred(adj_list* adj_list_in, int source){
	dist_pred* dist_pred_out;int num_nodes,i;
	dist_pred_out=dijkstra(adj_list_in,source);
	num_nodes=adj_list_in->num_nodes;
	for (i=0;i<num_nodes;i++){
		printf("dist(%d,%d)=%d, pred(%d)=%d\n",source,i,dist_pred_out[i].dist,i,dist_pred_out[i].pred);
	}
}

//main

int main(void)  {
adj_list* graph ;edge* arr; int* d; heap* heap_in; node_key node_key_out;
	srand(time(NULL));
	graph=new_erdos_graph(0.5,6,4);
	print_adj_list(graph);
	print_dist_pred(graph,0);
	delete_adj_list(graph);
	return 0;
}


