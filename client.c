#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/types.h>
#include <netinet/in.h>
#include <sys/socket.h>


//from https://en.wikibooks.org/wiki/C_Programming/Networking_in_UNIX

int main(){
	
	int mysocket;
	struct sockaddr_in dest;
	
	mysocket = socket(AF_INET,SOCK_STREAM,0);
	
	memset(&dest,0, sizeof(dest));
	dest.sin_family = AF_INET;
	dest.sin_addr.s_addr = htonl(INADDR_LOOPBACK);
	
	connect(mysocket, (struct sockaddr *)&dest, sizeof(struct sockaddr_in));
	
	
	close(mysocket);
}
