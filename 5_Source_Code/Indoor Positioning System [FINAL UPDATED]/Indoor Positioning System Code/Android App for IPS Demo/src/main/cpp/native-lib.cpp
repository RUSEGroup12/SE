#include <jni.h>
#include <string>
#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<errno.h>
#include<string.h>
#include<unistd.h>
#include<arpa/inet.h>


#include <time.h>

#define RAND_MAX = 60;


int add(int x, int y);
int getSignal(char* data);
int transmitSignal();

extern "C"
JNIEXPORT jstring JNICALL
Java_comrusegroup12se_github_indoorpositioningsystem_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {



    int z= add(1,2);

    char str[50];

    sprintf(str, "%d",z);


   int y = transmitSignal();

    std::string hello = str;

    return env->NewStringUTF(hello.c_str());
}

int transmitSignal(){


    int streamLength = 7;	//size to send over network
    char* data = (char*)calloc(streamLength, sizeof(char));	//will hold wifi decibels
    data[4]='\0';


    struct sockaddr_in remote_server;		//will hold ip info of server
    int sock;							//socket to access server


    sock = socket(AF_INET, SOCK_STREAM, 0);




      remote_server.sin_family = AF_INET;
      remote_server.sin_port = htons(25000);	//remote server port number
      remote_server.sin_addr.s_addr = inet_addr("192.168.2.227");	//remote server ip
      bzero(&remote_server.sin_zero, 8);


      connect(sock,(struct sockaddr*)&remote_server, sizeof(struct sockaddr_in));


      int d = getSignal(data);
      send(sock, data, streamLength, 0);		//transmitting data over network



      free(data);

      close(sock);

      sleep(2);


return 1;

}

int getSignal(char* data){

    /*system("iwconfig wlo1>netinfo.txt");									//get iwconfig and saving output to text
    system("grep 'level=' netinfo.txt | sed 's/^.*: //'>signal.txt");		//saving line with signal level to text

    FILE *fp;
    fp = fopen("signal.txt", "r");

    char signalLine[110];	//stores line in array

    fgets(signalLine,100,fp);

    char c = '-';	//token to find

    char* val = strchr(signalLine,c);	//finding location of -

    memcpy(data,val,4);


    puts(val);

    fclose(fp);*/

    srand(time(NULL));   // should only be called once
    int r = -1*(rand()%60);      // returns a pseudo-random integer between 0 and RAND_MAX

    //int r = -99;

    sprintf(data,"%d",r);


    return 1;


}


int add(int x, int y){


    return x+y;

}