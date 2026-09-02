#include<iostream>
#include<string>
using namespace std;

class Patient
{
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:

    // Constructor 1 - Default
    Patient() : patientId(0), name("Unknown"), age(0),
                ward("General"), bloodGroup("O+")
    {
        cout << "[Constructor] Default patient registered." << endl;
    }

    // Constructor 2 - Emergency admission
    Patient(int id, const string& name)
        : patientId(id), name(name), age(0),
          ward("General"), bloodGroup("O+")
    {
        cout << "[Constructor] Emergency: " << name << endl;
    }

    // Constructor 3 - Full admission
    Patient(int id, const string& name, int age,
            const string& ward, const string& bg)
        : patientId(id), name(name), age(age),
          ward(ward), bloodGroup(bg)
    {
        cout << "[Constructor] Full admission: " << name << endl;
    }

    // Destructor
    ~Patient()
    {
        cout << "[Destructor] Patient "
             << name << " discharged." << endl;
    }

    void displayRecord() const
    {
        cout << "\nPatient Record:" << endl;
        cout << "ID : " << patientId << endl;
        cout << "Name : " << name << endl;
        cout << "Age : " << age << endl;
        cout << "Ward : " << ward << endl;
        cout << "Blood Grp : " << bloodGroup << endl;
    }

    void transferWard(const string& newWard)
    {
        cout << "Ward Transfer: " << name
             << " -> " << newWard << endl;

        ward = newWard;
    }
};

int main()
{
    {
        // Three stack objects using different constructors

        Patient p1(1001, "Meera Joshi",
                   34, "Cardiology", "B+");

        Patient p2(1002, "Raj Patel");

        Patient p3;


        // Dynamic array of 4 patients
        Patient* patients = new Patient[4];

        // Display all 4 patients
        cout << "\n===== Dynamic Patient Records =====" << endl;

        for(int i = 0; i < 4; i++)
        {
            patients[i].displayRecord();
        }

        // Transfer one patient's ward
        p2.transferWard("ICU");

        // Delete dynamic array
        cout << "\n===== Deleting Dynamic Array =====" << endl;

        delete[] patients;

        cout << "\n===== End of Scope =====" << endl;
    }

    return 0;
}