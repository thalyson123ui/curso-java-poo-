package programa11;

public class escopoeinicializacao {
    public static void main(String[] args) {
        double price = 400.0;

        double discount = 0.0;
        if (price < 200.0) {
            discount = price * 0.1;
            price = price - discount;
        }else {
            discount = price * 0.2;
            price = price - discount;
        }
        System.out.println("Price: " + price);
    }
}
