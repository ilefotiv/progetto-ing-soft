#include <stdio.h>
#include <stdlib.h>

int main(void)  {
  printf ("Hello world!\n");
  return 0;
}



struct list{
	struct list *next;
	int node;
};
typedef struct list list;

struct adj_list{
	struct list *list;
	int num_nodes;
};
typedef struct adj_list adj_list;


list new_list(int num_nodes){
	list *l=NULL;
	return l;
}

list



