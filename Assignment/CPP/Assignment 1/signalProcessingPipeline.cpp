#include <iostream>
#include <cmath>
using namespace std;

double computeRMS(double* signal, int n)
{
    double sum = 0;
    double* ptr = signal;

    for (int i = 0; i < n; i++)
    {
        sum = sum + (*ptr) * (*ptr);
        ptr++;
    }

    return sqrt(sum / n);
}

void normalise(double* signal, int n)
{
    double* ptr = signal;
    double maxValue = fabs(*ptr);

    for (int i = 1; i < n; i++)
    {
        ptr++;

        if (fabs(*ptr) > maxValue)
        {
            maxValue = fabs(*ptr);
        }
    }

    ptr = signal;

    for (int i = 0; i < n; i++)
    {
        *ptr = *ptr / maxValue;
        ptr++;
    }
}

int countZeroCrossings(double* signal, int n)
{
    int count = 0;
    double* ptr = signal;

    for (int i = 0; i < n - 1; i++)
    {
        if ((*ptr > 0 && *(ptr + 1) < 0) ||
            (*ptr < 0 && *(ptr + 1) > 0))
        {
            count++;
        }

        ptr++;
    }

    return count;
}

void applyGain(double* signal, int n, double gainFactor)
{
    double* ptr = signal;

    for (int i = 0; i < n; i++)
    {
        *ptr = *ptr * gainFactor;
        ptr++;
    }
}

int main()
{
    double signal[] = {0.5, -1.2, 0.8, -0.3, 1.0, -0.9, 0.1};
    int n = 7;
    double gainFactor = 2.0;

    cout << "Original Signal: ";
    for (int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    cout << endl;

    double rms = computeRMS(signal, n);
    cout << "RMS = " << rms << endl;

    int crossings = countZeroCrossings(signal, n);
    cout << "Zero Crossings = " << crossings << endl;

    cout << "\nBefore Normalise: ";
    for (int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    normalise(signal, n);

    cout << "\nAfter Normalise: ";
    for (int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    cout << "\n\nBefore Gain: ";
    for (int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    applyGain(signal, n, gainFactor);

    cout << "\nAfter Gain: ";
    for (int i = 0; i < n; i++)
    {
        cout << signal[i] << " ";
    }

    cout << endl;

    return 0;
}