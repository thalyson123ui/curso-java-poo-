package programa21;

public class products {
    public String name;
    public double price;
    public int quantity;

    public double totalvalueinstock() {
        return price * quantity;
    }

    public void addproducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeproducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalvalueinstock());
} 
}
