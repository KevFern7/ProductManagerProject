package ProductManager;

public class ProductManager {

    public double calculatePriceAfterTax(double price, double taxRate) {
        return price + (price * taxRate);
    }
}
