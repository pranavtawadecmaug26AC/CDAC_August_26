// _3constructorDestructor.cpp // 3

#include <iostream>
using namespace std;

class Student {
    public :
    
    int age;
    int rollNo;

    // default constructor
    Student() {
        cout << "Default Constructor called" << endl;
    }

    // parameterized constructor
    Student(int a, int r) {
        cout << "parameterized Constructor called" << endl;
        age = a;
        rollNo = r;
    }

    void showDetails (){
        cout << "Age : " << age << "\n" << "Roll No. : " << rollNo << endl;
    };

    
};

int main() {

    Student s;
    s.age = 10;
    s.rollNo = 100;
    s.showDetails();

    Student s1(11, 101);
    s1.showDetails();

    


    return 0;
}