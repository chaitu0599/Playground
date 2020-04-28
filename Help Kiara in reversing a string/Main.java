#include <iostream>
#include<cstring>
using namespace std;
int main()
{
char str[100], rev[100];     
int count = 0, end, i; 
 cin.getline(str,20);
 for(i=strlen(str)-1;i>=0;i--)
  cout<<str[i];
//Your code goes here               
//std::cout<<reverse(str.begin(),str.end());
}