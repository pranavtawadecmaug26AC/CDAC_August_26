#include<iostream>
#include<cstdlib>
using namespace std;

int main()
{
    int row, cols;

    cout << "Enter number of rows: ";
    cin >> row;

    cout << "Enter number of columns: ";
    cin >> cols;

    int** arr = new int*[row];

    for(int i = 0; i < row; i++)
    {
        arr[i] = new int[cols];
    }

    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < cols; j++)
        {
            arr[i][j] = rand() % 5;
        }
    }

    cout << "\n===== GAME MAP (" << row << " x "
         << cols << ") =====" << endl;

    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < cols; j++)
        {
            cout << arr[i][j] << " ";
        }

        cout << endl;
    }

    cout << "\nLegend: 0=Grass 1=Water 2=Mountain "
         << "3=Forest 4=Dungeon" << endl;

    int grass = 0;
    int water = 0;
    int mountain = 0;
    int forest = 0;
    int dungeon = 0;

    for(int i = 0; i < row; i++)
    {
        for(int j = 0; j < cols; j++)
        {
            switch(arr[i][j])
            {
                case 0:
                    grass++;
                    break;

                case 1:
                    water++;
                    break;

                case 2:
                    mountain++;
                    break;

                case 3:
                    forest++;
                    break;

                case 4:
                    dungeon++;
                    break;
            }
        }
    }

    cout << "\nTile Count:" << endl;
    cout << "Grass : " << grass << endl;
    cout << "Water : " << water << endl;
    cout << "Mountain : " << mountain << endl;
    cout << "Forest : " << forest << endl;
    cout << "Dungeon : " << dungeon << endl;

    // Deallocating memory
    for(int i = 0; i < row; i++)
    {
        delete[] arr[i];
    }

    delete[] arr;

    return 0;
}