#include<stdio.h>
#include<string.h>
struct FileTable{
	char name[20];
	int sb,nob;
}ft[30];
int main(){
	int i,j,n;
	char s[20];
	printf("Enter no. of files:  ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("\nEnter the file name %d: ",i+1);
		scanf("%s",ft[i].name);
		printf("\nEnter starting block of the file %d: ",i+1);
		scanf("%d",&ft[i].sb);
		printf("\nEnter no of blocks in file %d: ",i+1);
		scanf("%d",&ft[i].nob);
	}
	printf("\nEnter the file name to be searched-- ");
	scanf("%s",s);
	for(i=0;i<n;i++)
		if(strcmp(s,ft[i].name)==0){
			break;
		}
		if(i==n){
			printf("\n File not found.");
		}
		else{
			printf("\nFILE NAME START BLOCK NO OF BLOCKS OCCUPIED\n");
			printf("\n%s\t\t%d\t\t%d\t",ft[i].name,ft[i].sb,ft[i].nob);
			for(j=0;j<ft[i].nob;j++){
				printf("%d",ft[i].sb+j);
			}
		}
		
	return 0;
}
