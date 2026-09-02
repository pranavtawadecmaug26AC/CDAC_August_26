#include<iostream>
using namespace std;

// For integer quantity
double reorderCost(int qty, double unitPrice)
{
    return qty * unitPrice;
}

// For fractional quantity
double reorderCost(double qty, double unitPrice)
{
    return qty * unitPrice;
}

// For quantity with tax
double reorderCost(int qty, double unitPrice, double taxRate)
{
    double cost = qty * unitPrice;
    return cost + (cost * taxRate / 100);
}

// Discount with default argument
double applyDiscount(double price, double discountPercent = 10.0)
{
    return price - (price * discountPercent / 100);
}

int main()
{
    int qty1;
    double qty2;
    double unitPrice;
    double taxRate;
    double discountPercent;

    cout << "Enter integer quantity: ";
    cin >> qty1;

    cout << "Enter fractional quantity: ";
    cin >> qty2;

    cout << "Enter unit price: ";
    cin >> unitPrice;

    cout << "Enter tax rate: ";
    cin >> taxRate;

    cout << "Enter discount percentage: ";
    cin >> discountPercent;

    cout << "\nReorder cost for integer quantity: " << reorderCost(qty1, unitPrice) << endl;

    cout << "Reorder cost for fractional quantity: "<< reorderCost(qty2, unitPrice) << endl;

    cout << "Reorder cost with tax: "<< reorderCost(qty1, unitPrice, taxRate) << endl;

    cout << "Price after given discount: "<< applyDiscount(unitPrice, discountPercent) << endl;

    cout << "Price after default 10% discount: "<< applyDiscount(unitPrice) << endl;

    return 0;
}