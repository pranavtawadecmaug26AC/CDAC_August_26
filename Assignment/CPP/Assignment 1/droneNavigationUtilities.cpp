#include<iostream>
#include<cmath>
using namespace std;

inline double distanceBetween(double x1, double y1, double x2, double y2)
{
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees)
{
    return degrees * (M_PI / 180.0);
}

inline double clamp(double value, double minVal, double maxVal)
{
    if(value < minVal)
    {
        return minVal;
    }
    else if(value > maxVal)
    {
        return maxVal;
    }
    else
    {
        return value;
    }
}

inline bool isInSafeZone(double x, double y, double cx, double cy, double radius)
{
    return distanceBetween(x, y, cx, cy) <= radius;
}

int main()
{
    double homeX = 0.0;
    double homeY = 0.0;
    double radius = 50.0;

    double waypoint1[] = {10.0, 20.0};
    double waypoint2[] = {30.0, 40.0};
    double waypoint3[] = {60.0, 10.0};

    cout << "Waypoint 1" << endl;
    cout << "Distance: " << distanceBetween(homeX, homeY, waypoint1[0], waypoint1[1]) << endl;
    cout << "Safe Zone: "<< isInSafeZone(waypoint1[0], waypoint1[1], homeX, homeY, radius) << endl;

    cout << "Waypoint 2" << endl;
    cout << "Distance: "<< distanceBetween(homeX, homeY, waypoint2[0], waypoint2[1])<< endl;
    cout << "Safe Zone: "<< isInSafeZone(waypoint2[0], waypoint2[1], homeX, homeY, radius)<< endl;

    cout << "Waypoint 3" << endl;
    cout << "Distance: "<< distanceBetween(homeX, homeY, waypoint3[0], waypoint3[1])<< endl;
    cout << "Safe Zone: "<< isInSafeZone(waypoint3[0], waypoint3[1], homeX, homeY, radius)<< endl;

    return 0;
}