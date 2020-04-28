#include<iostream>
using namespace std;
#include<string>
int main()
{
  string a,b;
  cin>>a;
  while(a != "####")
  {
  cin>>b;
    if(a.at(a.size()-1)==b.at(0)){
      cout<<a<<"\n";
      a=b;
    }
    else
      break;
  }
  cout<<a;
  //Type your code here.
}