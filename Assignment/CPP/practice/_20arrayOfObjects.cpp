//_20arrayOfObjects.cpp

#include <iostream>
using namespace std;

class Student {
    int num;
    string name;

    public:

    void setDetails(int r, string n){
        num = r;
        name = n;
    };

    int getNum(){
        return num;
    };

    string getName(){
        return name;
    };

};

int main(){
    // Student std;

    // std.setDetails(1, "abc");

    // cout << std.getNum() << endl;
    // cout << std.getName() << endl;

    // ----------------------------------------------
    // Student std[2];

    // std[0].setDetails(101, "Rahul");
    // std[1].setDetails(102, "Aman");

    // cout << std[0].getNum() << " "
    //      << std[0].getName() << endl;

    // cout << std[1].getNum() << " "
    //      << std[1].getName() << endl;

    //--------------------------------------------
    Student students[2];

    // Take input
    for (int i = 0; i < 2; i++) {
        int num;
        string name;

        cout << "Enter roll number: ";
        cin >> num;

        cout << "Enter name: ";
        cin >> name;

        students[i].setDetails(num, name);
    }

    // Display output
    cout << "\nStudent Details:\n";

    for (int i = 0; i < 2; i++) {
        cout << students[i].getNum() << " "
             << students[i].getName() << endl;
    }

    return 0;
}