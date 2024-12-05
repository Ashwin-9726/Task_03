// Taxable interface with data members for salesTax and incomeTax

 interface Taxable {
    double salesTax=0.07;  // Sales tax rate (7%)
    double incomeTax=0.105; // Income tax rate (10.5%)
     // Abstract method to calculate the tax
     double calculateTax();
}
