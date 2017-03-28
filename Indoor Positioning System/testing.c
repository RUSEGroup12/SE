#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<errno.h>
#include<string.h>
#include<unistd.h>
#include<arpa/inet.h>


/*This will test that all possible values
  for the decibel range can traverse the 
  network and reach the other side*/
int test1(){

	
	 int len = 3;
	 
	 for(int c1=0; c1>-100; c1--){
		 
		 char data [3] = "000";
		 
		 sprintf(data, "%d", c1);
	 
	 struct sockaddr_in remote_server;		//will hold ip info of server
	 int sock;							//socket to access server
	 
	 
	 if((sock = socket(AF_INET, SOCK_STREAM, 0))==-1){
		
		perror("socket: ");
		exit(-1);
	}
	
	
	remote_server.sin_family = AF_INET;
	remote_server.sin_port = htons(25000);	//remote server port number
	remote_server.sin_addr.s_addr = inet_addr("127.0.0.1");	//remote server ip 
	bzero(&remote_server.sin_zero, 8);
	
	
	connect(sock,(struct sockaddr*)&remote_server, sizeof(struct sockaddr_in));
	 
	 
	if((send(sock, data, len, 0) )==-1){		//transmitting data over network
		
		perror("send");
		exit(-1);
	}
	
		
	close(sock);
	
	sleep(1);
	}

}
/*More Tests will be added
  as the program gets closes
  to completetion*/

int test2(){
	
	//Future
	
}



int main(){
	
	
	test1();

	
}
