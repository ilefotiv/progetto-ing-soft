
#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <math.h>
#include <time.h>

typedef struct list {
	struct list* next;
	int elem;
} list;

list* add_elem(list* list_in, int elem_in) {
		list* list_out=(list*)malloc(sizeof(list));
		list_out->next=list_in;
		list_out->elem=elem_in;
		return list_out;
}

list* delete_elem(list* list_in){
	list* list_out=list_in->next;
	free(list_in);
	return list_out;
}

typedef struct adj_list {
	list **node;
	int num_nodes;
}adj_list;

adj_list* new_adj_list(int num_nodes){
	int i;
	adj_list* adj_list_out=(adj_list*)malloc(sizeof(adj_list));
	adj_list_out->num_nodes=num_nodes;
	adj_list_out->node=(list**)malloc(num_nodes*sizeof(list*));
	for(i=0;i<num_nodes;i++){
		adj_list_out->node[i]=NULL;
	}
	return adj_list_out;
}

void add_edge(adj_list* adj_list_in, int i,int j){
	adj_list_in->node[i]=add_elem(adj_list_in->node[i],j);
	adj_list_in->node[j]=add_elem(adj_list_in->node[j],i);
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

adj_list* new_erdos_graph(float p,int num_nodes){
	adj_list* adj_list_out; int i,j; float r;
	adj_list_out=new_adj_list(num_nodes);
	for(i=0;i<num_nodes;i++){
		for(j=0;j<i;j++){
			r=rand();
			if (r<=p*RAND_MAX)
			add_edge(adj_list_out,i,j);
		}
	}
	return adj_list_out;
}

void print_adj_list(adj_list* adj_list_in){
	int i;list* p;
	for(i=0;i<adj_list_in->num_nodes;i++){
		p=adj_list_in->node[i];
		printf("%d->(",i);
		while(p!=NULL){
			printf("%d ",p->elem);
			p=p->next;
		}
		printf(") \n");
	}
}

int main(void)  {
adj_list* graph;
	srand(time(NULL));
	graph=new_erdos_graph(0.2,100);
	print_adj_list(graph);
	return 0;
}

