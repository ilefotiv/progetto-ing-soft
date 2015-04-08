#include <stdio.h>
int main(void)  {
  printf ("Hello world!\n");
  return 0;
}



struct list {
	int node;
	struct list *next;
};

struct adj_list  {
	struct list list[];
	int num;
};


