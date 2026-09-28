// _4constructorInitializerList.cpp // 4

#include <iostream>
#include <string>
using namespace std;

class Student {
    int age;
    int rollNo;
    const string course;

    public :
    Student(int a, int r, string c) : age(a), rollNo(r), course(c)
    {
        cout << "constructor called" << endl;
    }

    void showDetails (){
        cout << "Age : " << age << "\n" << "Roll No. : " << rollNo << "couse" << course << endl;
    };

    
};

int main() {
    Student s(10, 11, "AC");
    s.showDetails();

    Student s1(20, 21, "BDA");
    s1.showDetails();

}