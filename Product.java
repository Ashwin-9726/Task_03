// Product class implementing the Taxable interface
public class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;
    // Constructor to initialize product details
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    //Getter methods for Product class
    public int getPid() {
        return pid;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    //Method to calculate Sales Tax on the product based on unit price
    public double calculateTax(){
    return price * salesTax * quantity;
    }
}
