#include <iostream>
using namespace std;
int c =0;
void pr(){
    if (c == 10) return;
    cout << c;
    c++;
    pr();
}

int main(){
    pr();
}
