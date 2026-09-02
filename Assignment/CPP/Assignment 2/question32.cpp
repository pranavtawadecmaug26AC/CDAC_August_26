#include<iostream>
using namespace std;

namespace Physics
{
    double clamp(double val, double min, double max)
    {
        if(val < min)
        {
            return min;
        }
        else if(val > max)
        {
            return max;
        }
        else
        {
            return val;
        }
    }

    double lerp(double a, double b, double t)
    {
        return a + t * (b - a);
    }
}

namespace GameMath
{
    int clamp(int val, int min, int max)
    {
        if(val < min)
        {
            return min;
        }
        else if(val > max)
        {
            return max;
        }
        else
        {
            return val;
        }
    }

    double lerp(double a, double b, double t)
    {
        return a + t * (b - a);
    }
}

int main()
{
    // Using Physics namespace only inside this block
    {
        using namespace Physics;

        double velocity = clamp(35.0, 20.0, 30.0);
        cout << "Clamped velocity: " << velocity << endl;

        double physicsValue = lerp(10.0, 20.0, 0.5);
        cout << "Physics lerp: " << physicsValue << endl;
    }

    // Physics namespace is no longer actve here

    int health = GameMath::clamp(120, 0, 100);
    cout << "Clamped health: " << health << endl;

    double uiValue = GameMath::lerp(0.0, 100.0, 0.25);
    cout << "GameMath lerp: " << uiValue << endl;

    return 0;
}