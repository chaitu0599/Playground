#include<iostream>
using namespace std;
int check(int,int[]);
int main()
{
  int n,a[20];
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  if(check(n,a)==1)
    cout<<"The array is Even";
  else if(check(n,a)==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
  //Type your code here.
}
int check(int n,int a[]){
  int ec=0,oc=0;
  for(int i=0;i<n;i++){
    if(a[i]%2==0)
      ec++;
    else
      oc++;  
  }
  if(ec==n)
    return(1);
  else if(oc==n)
    return(2);
  else
    return(3);
  

}