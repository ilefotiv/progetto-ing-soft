//d_d_heap

//elemento del d-ary d_heap

typedef struct d_node_dist{
	int node;//restituisce il nodo in posizione sort
	int dist;//restituisce la chiave a partire dalla posizione nell'd_heap del nodo
	int sort;//restituisce la posizione nell'd_heap del nodo node
}d_node_dist;

// struttura d-d_heap

typedef struct d_heap{
	d_node_dist* nd;//array di elementi
	int num_nodes;//numero di elementi memorizzati nell'd_heap
	int num_children;//massimo numero di figli per ogni padre
} d_heap;

//scambia nell' array d_node_dist_in relativo all'd_heap l'elemento in posizione sort1 e sort2

void sweep(d_node_dist* d_node_dist_in, int sort1,int sort2){
	int sr, k; int el;
	el=d_node_dist_in[sort2].node;
	d_node_dist_in[sort2].node=d_node_dist_in[sort1].node;
	d_node_dist_in[sort1].node=el;
	k=d_node_dist_in[sort2].dist;
	d_node_dist_in[sort2].dist=d_node_dist_in[sort1].dist;
	d_node_dist_in[sort1].dist=k;
	sr=d_node_dist_in[sort1].node;
	d_node_dist_in[sr].sort=sort1;
	sr=d_node_dist_in[sort2].node;
	d_node_dist_in[sr].sort=sort2;
}

//crea un d-d_heap a partire dalla lista di adiacenza con numero di figli pari al rapporto fra archi e nodi

d_heap* d_new_heap(adj_list* adj_list_in,int source){
	d_heap* d_heap_out; d_node_dist* d_node_dist_in; int i,num_nodes=adj_list_in->num_nodes;
	d_heap_out=(d_heap*)malloc(sizeof(d_heap));
	d_heap_out->num_children=adj_list_in->num_edges/num_nodes+1;
	d_heap_out->num_nodes=num_nodes;
	d_heap_out->nd=(d_node_dist*)malloc((num_nodes)*sizeof(d_node_dist));
	d_node_dist_in=d_heap_out->nd;
	for (i=0;i<num_nodes;i++){
		d_node_dist_in[i].node=i;
		d_node_dist_in[i].sort=i;
		d_node_dist_in[i].dist=INT_MAX;
	}
	sweep(d_node_dist_in,0,d_heap_out->nd[source].sort);
	d_node_dist_in[0].dist=0;
	return d_heap_out;
}

//decresce la chiave di un d_heap...restituisce true se e solo se avviene effettivamente una descrescita

bool d_decrease_dist(d_heap* d_heap_in, int node_in,int dist_in){
	int sort1,sort2,num_children;d_node_dist* d_node_dist_in;
	d_node_dist_in=d_heap_in->nd;
	num_children=d_heap_in->num_children;
	sort1=d_node_dist_in[node_in].sort;
	if (dist_in<d_node_dist_in[sort1].dist){
		d_heap_in->nd[sort1].dist=dist_in;
		sort2=sort1;
		sort1=(sort2-1)/num_children;
		while(d_node_dist_in[sort1].dist>d_node_dist_in[sort2].dist && sort2>0){
			sweep(d_node_dist_in,sort1,sort2);
			sort2=sort1;
			sort1=(sort2-1)/num_children;
		}
		return true;
	}
	return false;
}

//true se e solo so l'd_heap è vuoto...in tal caso lo elemina

bool empty_heap(d_heap* d_heap_in){
	if(d_heap_in->num_nodes>0)return false;
	free(d_heap_in->nd);
	free(d_heap_in);
	return true;
}

//stampa l'd_heap

void print_heap(d_heap* d_heap_in){
	int i;
	for (i=0;i<d_heap_in->num_nodes;i++) printf("(%d,%d,%d)",d_heap_in->nd[i].node,d_heap_in->nd[i].dist,d_heap_in->nd[i].sort);
	printf("\n");
}

//estrae l'elemento dell'd_heap relativo a chiave minima

node_dist d_extract_min(d_heap* d_heap_in){
	node_dist node_dist_out;int sort1=0, sort2, i,first_child1, last_child1, num_children=d_heap_in->num_children;
	d_node_dist* d_node_dist_in=d_heap_in->nd;
	int num_nodes=d_heap_in->num_nodes;
	node_dist_out.node=d_node_dist_in[0].node;
	node_dist_out.dist=d_node_dist_in[0].dist;
	first_child1=1;
	while(first_child1<num_nodes){
		sort2=first_child1;
		if(first_child1+num_children<num_nodes) last_child1=first_child1+num_children;
		else last_child1=num_nodes;
		for(i=first_child1+1;i<last_child1;i++){
			if (d_node_dist_in[i].dist<d_node_dist_in[sort2].dist){
				sort2=i;
			}
		}
		sweep(d_node_dist_in,sort1,sort2);
		sort1=sort2;
		first_child1=sort1*num_children+1;
	}
	sweep(d_node_dist_in,sort1,num_nodes-1);
	d_heap_in->num_nodes--;
	return node_dist_out;
}
