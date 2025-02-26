#include "network.h"

float calcolaSomma(float val1, float val2)  {
   return (val1 + val2);
}

char * calcolaPrimi(int val1, int val2) {
    bool flag;

    // lower bound 
    int a = val1;
    
    // upper bound
    int b = val2;

    char *result = malloc(val2);
 
    // Traverse each number in the interval
    // with the help of for loop
    for (int i = a; i <= b; i++) {
        // Skip 0 and 1 as they are
        // neither prime nor composite
        if (i == 1 || i == 0)
            continue;
 
        // flag variable to tell
        // if i is prime or not
        flag = 1;
 
        for (int j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
 
        // flag = 1 means i is prime
        // and flag = 0 means i is not prime
        if (flag == 1)
        {
            char *str = malloc(1000);
            sprintf(str, "%d", i);
            strcat(result, str);
            strcat(result, "\n");
            free(str);
        }
    }
    return result;
}

int main(){
    socketif_t sockfd;
    FILE* connfd;
    int res, i;
    long length=0;
    char request[MTU], url[MTU], method[10], c;
    
    sockfd = createTCPServer(8000);
    if (sockfd < 0){
        printf("[SERVER] Errore: %i\n", sockfd);
        return -1;
    }
    
    while(true) {
        connfd = acceptConnectionFD(sockfd);
        
        fgets(request, sizeof(request), connfd);
        strcpy(method,strtok(request, " "));
        strcpy(url,strtok(NULL, " "));
        while(request[0]!='\r') {
            fgets(request, sizeof(request), connfd);
            if(strstr(request, "Content-Length:")!=NULL)  {
                length = atol(request+15);
            }
        }
        
        if(strcmp(method, "POST")==0)  {
            for(i=0; i<length; i++)  {
                c = fgetc(connfd);
            }
        }
        
        if(strstr(url, "calcola-somma")==NULL)
            if(strstr(url, "calcola-num-primi")==NULL)
                fprintf(connfd,"HTTP/1.1 200 OK\r\n\r\n{\r\n    Funzione non riconosciuta!\r\n}\r\n");
            else
            {
                printf("Chiamata a funzione numero primo\n");
            
                char *function, *op1, *op2; 
                int val1, val2;

    
                // skeleton: decodifica (de-serializzazione) dei parametri
                function = strtok(url, "?&");
                op1 = strtok(NULL, "?&");
                op2 = strtok(NULL, "?&");
                strtok(op1,"=");
                val1 = atof(strtok(NULL,"="));
                strtok(op2,"=");
                val2 = atof(strtok(NULL,"="));

                char *primi;
                
                // chiamata alla business logic
                primi = calcolaPrimi(val1, val2);
                
                
                // skeleton: codifica (serializzazione) del risultato
                fprintf(connfd,"HTTP/1.1 200 OK\r\n\r\n{\r\n    \"numeri primi\":%s\r\n}\r\n", primi);

                free(primi);
            }
        else
        {
            printf("Chiamata a funzione sommatrice\n");
            
            char *function, *op1, *op2;
            float somma, val1, val2;
   
            // skeleton: decodifica (de-serializzazione) dei parametri
            function = strtok(url, "?&");
            op1 = strtok(NULL, "?&");
            op2 = strtok(NULL, "?&");
            strtok(op1,"=");
            val1 = atof(strtok(NULL,"="));
            strtok(op2,"=");
            val2 = atof(strtok(NULL,"="));
            
            // chiamata alla business logic
            somma = calcolaSomma(val1, val2);
            
            // skeleton: codifica (serializzazione) del risultato
            fprintf(connfd,"HTTP/1.1 200 OK\r\n\r\n{\r\n    \"somma\":%f\r\n}\r\n", somma);
        }
        
        fclose(connfd);
                
        printf("\n\n[SERVER] sessione HTTP completata\n\n");
    }
    
    closeConnection(sockfd);
    return 0;
}



