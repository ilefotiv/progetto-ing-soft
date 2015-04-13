
//struttura nodo_dist...deve essere comune a tutti per l'output di extract min

typedef struct node_dist{
	int node;
	int dist;
} node_dist;

//struttura nodo adicente + peso, da usare nelle liste di adiacenza

typedef struct list {
	struct list* next;
	int node;
	int dist;
} list;

//aggiungi nodo adiacente ad un dato nodo della lista di adiacenza

list* add_node(list* list_in, int node_in, int dist_in) {
		list* list_out=(list*)malloc(sizeof(list));
		list_out->next=list_in;
		list_out->node=node_in;
		list_out->dist=dist_in;
		return list_out;
}

//cancella nodo adiacente

list* delete_node(list* list_in){
	list* list_out=list_in->next;
	free(list_in);
	return list_out;
}

//lista di adiacenza

typedef struct adj_list {
	list **node;
	int num_nodes;
	int num_edges;
}adj_list;

// crea una lista di adiacenza priva di archi con num_nodes nodi

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

//aggiunge un arco al grafo rappresentato come lista di adiacenza

void add_edge_und(adj_list* adj_list_in, int i,int j, int w){
	adj_list_in->node[i]=add_node(adj_list_in->node[i],j,w);
	adj_list_in->node[j]=add_node(adj_list_in->node[j],i,w);
	adj_list_in->num_edges++;
}

//cancella la lista di adiacenza

void delete_adj_list(adj_list* adj_list_in){
	int i;list* p;
	for(i=0;i<adj_list_in->num_nodes;i++){
		p=adj_list_in->node[i];
		while(p!=NULL){
			p=delete_node(p);
		}
	}
	free(adj_list_in->node);
}

//modella un arco

typedef struct edge{
	int node1;
	int node2;
} edge;

//stampa la lista di adiacenza

void print_adj_list(adj_list* adj_list_in){
	int i;list* p;
	for(i=0;i<adj_list_in->num_nodes;i++){
		p=adj_list_in->node[i];
		printf("%d->[",i);
		while(p!=NULL){
			printf("(%d,%d) ",p->node,p->dist);
			p=p->next;
		}
		printf("] \n");
	}
	printf("\n");
}

//crea un array di archi di un grafo completo non diretto (senza contare due volte lo stesso arco)
//da usare nell'algoritmo che sceglie casualmente un arco

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


//algoritmi per grafi random

//struttura punto per grafi costruti nel piano

typedef struct point{
	int x;
	int y;
}point;

//calcola distanza fra due punti

int dist(point point1,point point2){
	int dx,dy;
	dx=point1.x-point2.x;
	dy=point1.y-point2.y;
	return (int)sqrt(dx*dx+dy*dy);
}

// crea un grafi di erdos-reny in cui p è la probabilità di scegliere un arco, num_nodes è il numero di nodi
//max value è il massimo valore del peso di un arco, triang_dis vale true se il grafo è costruito a partire da punti nel piano
// e la lunghezza di un arco è pari alla distanza nel piano fra i due vertici

adj_list* new_erdos_graph(double p,int num_nodes, int max_value, bool trian_dis){
	adj_list* adj_list_out; int i,j,r,p_big=(int)(p*RAND_MAX); point* point_in;
	max_value++;
	if (trian_dis){
		point_in=(point*)malloc(num_nodes*sizeof(point*));
			for(i=0;i<num_nodes;i++){
				point_in[i].x=rand() % max_value;
				point_in[i].y=rand() % max_value;
			}
	}
	adj_list_out=new_adj_list(num_nodes);
	for(i=0;i<num_nodes;i++){
		for(j=0;j<i;j++){
			r=rand();
			if (r<=p_big){
				if (trian_dis) r=dist(point_in[i],point_in[j]);
				else r=r % max_value;
				add_edge_und(adj_list_out,i,j,r % max_value);
				adj_list_out->num_edges++;
			}
		}

	}
	if (trian_dis) free(point_in);
	return adj_list_out;
}

//grafo random con num_nodes nodi e num_edges archi...trian_dis ha los tesso ruolo dell'algoritmo precedente

adj_list* new_unif_graph(int num_nodes,int num_edges,edge* edge_in,int max_value, bool trian_dis){
	int i,num_nodes_curr,w,pick;adj_list* adj_list_out; point* point_in;
	max_value++;
	if (trian_dis){
		point_in=(point*)malloc(num_nodes*sizeof(point*));
			for(i=0;i<num_nodes;i++){
				point_in[i].x=rand() % max_value;
				point_in[i].x=rand() % max_value;
			}
	}
	num_nodes_curr=num_nodes*(num_nodes-1)/2;
	adj_list_out=new_adj_list(num_nodes);
	for(i=0;i<num_edges;i++,num_nodes_curr--){
		pick=rand()%num_nodes_curr;
		if (trian_dis) w=dist(point_in[edge_in[pick].node1],point_in[edge_in[pick].node2]);
		else w=rand()%max_value;
		add_edge_und(adj_list_out,edge_in[pick].node1,edge_in[pick].node2,w);
		edge_in[pick]=edge_in[num_nodes_curr-1];
	}
	adj_list_out->num_edges=num_edges;
	if (trian_dis) free(point_in);
	return adj_list_out;
}
