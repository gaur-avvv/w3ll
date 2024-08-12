#include<iostream> // Include the <iostream> header for input/output operations// Include the <fstream> header for input/output operations
using namespace std;
int main(){
    int day;
    cin>>day; // Use std::cin from the std namespace
    switch(day){
        case 1:
        cout<<"monday"<<endl;
        break;
        case 2:
        cout<<"tuesday"<<endl;
        break;
        case 3:
        cout<<"wednesday"<<endl;
        break;
        case 4:
        cout<<"thrusday"<<endl;
        break;
        case 5:
        cout<<"friday"<<endl;
        break;
        case 6:
        cout<<"saturday"<<endl;
        break;
        case 7:
        cout<<"sunday"<<endl;
        break;
        default:
        cout<<"invalid input"<<endl;
    }
}