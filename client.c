#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<errno.h>
#include<string.h>
#include<unistd.h>
#include<arpa/inet.h>

int getSignal();
int doStuff();


int main(){
	
	while(1){
	doStuff();
	
	//sleep(2);
	
	}
	
}

int doStuff(){
	 
	
	 
	 struct sockaddr_in remote_server;		//will hold ip info of server
	 int sock;							//socket to access server
	 //char data[] = "User 01   Speaker 05";
	 char* data = (char*)calloc(7, sizeof(char));
	 
	  
	 
	 data[4]='\0';			
	 int len = 7;
	 
	 
	 if((sock = socket(AF_INET, SOCK_STREAM, 0))==-1){
		
		perror("socket: ");
		exit(-1);
	}
	
	
	remote_server.sin_family = AF_INET;
	remote_server.sin_port = htons(10000);	//remote server port number
	remote_server.sin_addr.s_addr = inet_addr("127.0.0.1");	//remote server ip 
	bzero(&remote_server.sin_zero, 8);
	
	
	
	connect(sock,(struct sockaddr*)&remote_server, sizeof(struct sockaddr_in));
	 
	 
	 getSignal(data);
	if((send(sock, data, len, 0) )==-1){
		
		perror("send");
		exit(-1);
	}
		
	sleep(1);
	
	
	close(sock);
}

int getSignal(char* data){
	
	system("iwconfig wlo1>netinfo.txt");
	system("grep 'level=' netinfo.txt | sed 's/^.*: //'>signal.txt");
	
	FILE *fp;
	fp = fopen("signal.txt", "r");
	
	char str[200];
	
	fgets(str,100,fp);
	
	char c = '-';
	
	char* val = strchr(str,c);	//finding location of -
	memcpy(data,val,4);
	
	puts(val);
	
	fclose(fp);
}
