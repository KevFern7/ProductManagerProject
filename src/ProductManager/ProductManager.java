package ProductManager;

public class ProductManager {

    public double calculatePriceAfterTax(double price, double taxRate) {
        return price + (price * taxRate);
        
    }
    
    // added this !
    public double calculateDiscount(double price, double discountRate) {
        return price - (price * discountRate);
    }
   }
