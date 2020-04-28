#include<iostream>
using namespace std;
#include<cstring>
int main()
{
  int i,j,c=0;
  char a[50],b[50];
  cin>>a>>b;
  for(i=strlen(a)-1,j=0;i>=0,j<strlen(b);i--,j++)
    if(a[i]==b[j])
      c++;
  if(c==strlen(a))
    cout<<"It is correct";
  else
    cout<<"It is wrong";
  //Type your code here.
}