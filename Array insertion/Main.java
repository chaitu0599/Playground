#include<iostream>
using namespace std;
#include<cstdlib>
int main()
{
  int *p,n,v,l;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  p=(int *)malloc((n+1)*sizeof(int));
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>p[i];
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>l;
  if(l>n+1)
    cout<<"Invalid Input";
  else{
  cout<<"Enter the value to insert\n";
  cin>>v;
 p[n]=p[n-1];
  for(int i=n-1;i>=l-1;i--)
   p[i]=p[i-1];  
    p[l-1]=v;
  cout<<"Array after insertion is\n";
    for(int i=0;i<n+1;i++)
      cout<<p[i]<<endl;
    
  }

  //Type your code here.
}