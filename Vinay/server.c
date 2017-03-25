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


struct sockaddr_in dest;
struct sockaddr_in server;

int mysocket;

socklen_t socksize = sizeof(struct sockaddr_in);

memset(&server,0, sizeof(server));
server.sin_family = AF_INET;
server.sin_addr.s_addr = htonl(INADDR_ANY);
server.sin_port = htons(10000);

bind(mysocket,(struct sockaddr*)&server, sizeof(struct sockaddr));



listen(mysocket,10);
int clientSocket; 

while(1){
	
	clientSocket = accept(mysocket, (struct sockaddr*)&dest, &socksize);
	
	char cSize[33];
		 
		 if((recv(clientSocket, cSize, 33,0))==-1){	
		
		perror("recv");
		exit(-1);
	
		}
		
		printf("Got it");


	}
}
