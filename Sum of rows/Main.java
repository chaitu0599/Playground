#include<iostream>
using namespace std;
int main()
{
  int r,c,a[10][10],i,j,rs;
  cin>>r>>c;
  for(i=0;i<r;i++){
    rs=0;
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      rs+=a[i][j];}
    cout<<rs<<endl;  //Type your code here.
    }
}