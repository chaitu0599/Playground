#include <iostream>
#include<string>
using namespace std;
struct student
{
    string name;
    int roll;
    float marks;
};
int main() 
{
  struct student s;
  string n;
  getline(cin,s.name);
  cin>>s.roll;
  cin>>s.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s.name<<endl;
  cout<<"Roll: "<<s.roll<<endl;
  cout<<"Marks: "<<s.marks<<endl;
   //Your code goes here
}