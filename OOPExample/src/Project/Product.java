package Project;

public class Product {

    public String name;
    public Double price;
    public int quantity;



    public double totalValueInStock() {
        return quantity * price;
    }

    public void AddProducts (int quantity) {
        this.quantity += quantity;
    }

    public void RemoveProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
    
}
