#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<errno.h>
#include<string.h>
#include<unistd.h>
#include<arpa/inet.h>

int getSignal(char* data);

int transmitSignal(){
	 
	 int streamLength = 7;	//size to send over network
	 char* data = (char*)calloc(streamLength, sizeof(char));	//will hold wifi decibels
	 data[4]='\0';			
	 
	 
	 struct sockaddr_in remote_server;		//will hold ip info of server
	 int sock;							//socket to access server
	 
	 
	 if((sock = socket(AF_INET, SOCK_STREAM, 0))==-1){
		
		perror("socket error");
		exit(-1);
	}
	
	
	remote_server.sin_family = AF_INET;
	remote_server.sin_port = htons(25000);	//remote server port number
	remote_server.sin_addr.s_addr = inet_addr("127.0.0.1");	//remote server ip 
	bzero(&remote_server.sin_zero, 8);
	
	
	connect(sock,(struct sockaddr*)&remote_server, sizeof(struct sockaddr_in));
	 
	 
	 getSignal(data);
	if((send(sock, data, streamLength, 0) )==-1){		//transmitting data over network
		
		perror("send error");
		exit(-1);
	}
	
	free(data);	
		
	close(sock);
	
	sleep(2);
}

int getSignal(char* data){
	
	system("iwconfig wlo1>netinfo.txt");									//get iwconfig and saving output to text
	system("grep 'level=' netinfo.txt | sed 's/^.*: //'>signal.txt");		//saving line with signal level to text
	
	FILE *fp;
	fp = fopen("signal.txt", "r");
	
	char signalLine[110];	//stores line in array
	
	fgets(signalLine,100,fp);
	
	char c = '-';	//token to find
	
	char* val = strchr(signalLine,c);	//finding location of -
	
	memcpy(data,val,4);
	
	puts(val);
	
	fclose(fp);
}

int main(){
	
	while(1){
	transmitSignal();
	}
	
}
