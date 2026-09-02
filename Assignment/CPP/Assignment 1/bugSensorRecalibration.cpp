#include <iostream>
using namespace std;

void resetSensorPairV1(int reading1, int reading2)
{
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

void resetSensorPairV2(int& reading1, int& reading2)
{
    int temp = reading1;
    reading1 = reading2;
    reading2 = temp;
}

void resetSensorPairV3(int* reading1, int* reading2)
{
    int temp = *reading1;
    *reading1 = *reading2;
    *reading2 = temp;
}

int main()
{
    int reading1, reading2;

    cout << "Enter two sensor readings: ";
    cin >> reading1 >> reading2;

    cout << "\n--- V1: Call by Value ---" << endl;
    cout << "Before: A = " << reading1 << ", B = " << reading2 << endl;

    resetSensorPairV1(reading1, reading2);

    cout << "After : A = " << reading1 << ", B = " << reading2 << endl;

    /*
    V1 fails because the function receives copies of the original variables.
    The swapping happens only with these local copies inside the function.
    Therefore, the original variables in main() remain unchanged.
    Once the function finishes, its local copies are destroyed.
    */


    cout << "\n--- V2: Call by Reference ---" << endl;
    cout << "Before: A = " << reading1 << ", B = " << reading2 << endl;

    resetSensorPairV2(reading1, reading2);

    cout << "After : A = " << reading1 << ", B = " << reading2 << endl;

    cout << "\n--- V3: Call by Pointer ---" << endl;
    cout << "Before: A = " << reading1 << ", B = " << reading2 << endl;

    resetSensorPairV3(&reading1, &reading2);

    cout << "After : A = " << reading1 << ", B = " << reading2 << endl;

    return 0;
}