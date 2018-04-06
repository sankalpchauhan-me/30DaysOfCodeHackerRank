#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int testcase=0, n;
    scanf("%d", &n);
    while(testcase<n){
        char str[10000000];
        scanf("%s", str);
        int len = strlen(str);
        for(int i=0; i< len; i++){
           if(i%2==0){
                printf("%c", str[i]);
            }   
        }
        printf(" ");
        for(int j=0; j < len; j++){
            if(j%2!=0){
                printf("%c", str[j]);
            }
        }
        printf("\n");
        n--;
    }
    return 0;
}
