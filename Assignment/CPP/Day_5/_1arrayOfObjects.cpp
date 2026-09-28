// array of objects // 1

#include <iostream>
using namespace std;

class Student {
    int age;
    int rollNo;

    public :

    void acceptDetails(){
        cout << "Enter age" << endl;
        cin >> age;
        cout << "Enter roll no" << endl;
        cin >> rollNo;
    };

    void showDetails (){
        cout << "Age : " << age << "\n" << "Roll No. : " << rollNo << endl;
    };

    
};

int main() {

    // Student s;
    // s.acceptDetails();
    // s.showDetails();

    // Student studArr[2];
    // for(int i=0 ; i < 2 ; i++){
    //     studArr[i].acceptDetails();
    // }
    // for(int i=0 ;i < 2 ; i++){
    //     studArr[i].showDetails();
    // }

    // Student* studArr1 = new Student[3]
    // for(int i=0 ; i < 2 ; i++){
    //     studArr1[i].acceptDetails();
    // }
    // for(int i=0 ;i < 2 ; i++){
    //     studArr1[i].showDetails();
    // }

    // delete[] studArr1;

    // return 0;

}