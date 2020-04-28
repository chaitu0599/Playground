#include<iostream>
using namespace std;
int main()
{
  int a[10][10],i,j,max=0,r,c;
  cin>>r>>c;
  for(i=0;i<r;i++){
    max=0;
    for(j=0;j<c;j++){
      cin>>a[i][j];
      if(a[i][j]>max)
        max=a[i][j]; 
  }
    cout<<max<<endl;
  }    
  //Type your code here.
}