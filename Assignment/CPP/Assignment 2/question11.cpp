#include<iostream>
#include<string>
using namespace std;

class Product
{
    int productId;
    string name;
    double price;
    int quantity;

public:

    void acceptDetails()
    {
        cout << "Enter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> name;

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    void displayDetails() const
    {
        cout << productId << "\t"
             << name << "\t"
             << price << "\t"
             << quantity << "\t"
             << totalValue() << endl;
    }

    double totalValue() const
    {
        return price * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }
};

int main()
{
    Product products[5];
    int threshold;

    // Accept details of 5 products
    for(int i = 0; i < 5; i++)
    {
        cout << "\n------- Enter details for Product "
             << i + 1 << " -------" << endl;

        products[i].acceptDetails();
    }

    // Display all products
    cout << "\n================ INVENTORY REPORT ================" << endl;
    cout << "ID\tName\tPrice\tQty\tTotal Value" << endl;

    for(int i = 0; i < 5; i++)
    {
        products[i].displayDetails();
    }

    // Find product with highest total value
    int highest = 0;

    for(int i = 1; i < 5; i++)
    {
        if(products[i].totalValue() > products[highest].totalValue())
        {
            highest = i;
        }
    }

    cout << "\nHighest Value Product: "
         << products[highest].totalValue() << endl;

    // Enter threshold
    cout << "\nEnter stock threshold: ";
    cin >> threshold;

    // Display low-stock products
    cout << "\nLow Stock Products:" << endl;

    for(int i = 0; i < 5; i++)
    {
        if(products[i].isLowStock(threshold))
        {
            products[i].displayDetails();
        }
    }

    return 0;
}