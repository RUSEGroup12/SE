#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<errno.h>
#include<string.h>
#include<unistd.h>


int runServer(){
	
	
	int sock, cli;
	struct sockaddr_in server, client;
	unsigned int len;
	
	char buf [7];
	int sent;
	
	if((sock = socket(AF_INET, SOCK_STREAM, 0))==-1){
		
		perror("socket: ");
		exit(-1);
	}
	
	server.sin_family = AF_INET;
	server.sin_port = htons(10000);
	server.sin_addr.s_addr = INADDR_ANY;
	bzero(&server.sin_zero,8);
	
	len = sizeof(struct sockaddr_in); 
	
	if((bind(sock, (struct sockaddr *)&server, len)) == -1){	//binding server socket to server ip info
		
		perror("bind");
		exit(-1);
	}
	
	if((listen(sock,5) == -1)){		//listening on socket
		
		perror("listen");
		exit(-1);
	}
	
	
	pid_t ppid = getppid(); //later for forking new process. child processes will handle accepting socket
	
	while(1){
		
		if((cli = accept(sock, (struct sockaddr *)&client, &len)) == -1){
			
			perror("accept");
			exit(-1);
		}
		
		recv(cli, buf, sizeof(buf), 0);
		buf[6]='\0';
		
		printf("%s\n", buf);
		
		close(cli);
		
	}
	
	
}


int main(){
	
	runServer();
	
}
