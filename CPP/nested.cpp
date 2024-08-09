#include<iostream>
using namespace std;
int main(){
    int age;
    cin>>age;
    if(age<18){
        cout<<"you are not eligibal for job"<<endl;
    }
    else if(age<=57){
              cout<<"eligibal for job"<<endl;
        if(age>=55){
            cout<<", but retirement soon."<<endl;
        }
    }
    else if(age>57){
        cout<<"retirement age reached."<<endl;
    }
}