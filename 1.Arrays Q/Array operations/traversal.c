#include <stdio.h>

void display(int arr[],int n){
    for(int i=0; i<n; i++){
        printf("%d ",arr[i]); 
    }
}

int sorted_insertion(int arr[],int size,int element,int capecity,int index){
    if(size >= capecity){
        return -1; 
    }
}

int main(){
    int arr[10] = {10,29,40,11,3,65,2}; 

    int n = sizeof(arr)/sizeof(arr[0]); 

    int capecity = n; 
    display(arr,n); 
    
    int element = 44; // number to be inserted. 
    int index = 3; //number inseted at index 3. 

    sorted_insertion(arr,n,element,capecity,index); 
    return 0; 
}