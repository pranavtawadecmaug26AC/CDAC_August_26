// _2functionOverloading.cpp // 2

#include <iostream>
using namespace std;

int add (int a, int b){
    return a + b;
}

double add (double a, double b){
    return a + b;
}

int add (int a, int b, int c){
    return a + b + c;
}

int main() {
    int a = 10;
    int b = 10;
    int c = 30;

    cout << add(a, b) << endl;
    cout << add(a, b, c) << endl;
}